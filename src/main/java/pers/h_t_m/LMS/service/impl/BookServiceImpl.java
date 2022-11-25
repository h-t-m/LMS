package pers.h_t_m.LMS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.h_t_m.LMS.dao.AppointmentDao;
import pers.h_t_m.LMS.dao.BookDao;
import pers.h_t_m.LMS.dto.AppointDto;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.Book;
import pers.h_t_m.LMS.service.BookService;
import pers.h_t_m.LMS.utills.AppointStateEnum;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 1:25
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Service
public class BookServiceImpl implements BookService {
    //    依赖注入
    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointmentDao appointmentDao;

    public Book getById(int bookId) {
        return bookDao.queryById(bookId);
    }

    public List<Book> getList() {
        return bookDao.queryAll();
    }

    public AppointDto appoint(int bookId, int uid) {
        AppointDto appointDto = null;
        try {
            // 减库存
            int update = bookDao.reduceNumber(bookId);
            if (update <= 0) {
                System.out.println(AppointStateEnum.FAILURE);
            } else {
                // 执行预约操作
                int insert = appointmentDao.insertAppointment(bookId, uid);
                if (insert <= 0) {
                    System.out.println(AppointStateEnum.REPEAT);
                } else {
                    List<Appointment> appointment = appointmentDao.queryByKeyWithBook(bookId, uid);
                    // Appointment appointment = bookDao.queryApById(uid, bookId);
                    appointDto = new AppointDto(bookId, AppointStateEnum.SUCCESS, appointment.get(appointment.size() - 1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appointDto;
    }

    public List<Appointment> queryApById(int uid, int bookId) {
        return bookDao.queryApById(uid, bookId);
    }

    public boolean retBook(int uid, int bookId) {
        return bookDao.updateAppoint(uid, bookId) && bookDao.returnBook(bookId);
    }

    @Override
    public boolean updateBook(Integer bookId, String name,
                              Integer number, String author,
                              String publisher) {
        return bookDao.updateBook(bookId,
                new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                number,
                new String(author.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(publisher.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
    }

    @Override
    public boolean deleteBook(Integer bookId) {
        return bookDao.deleteBook(bookId);
    }

    @Override
    public boolean addBook(Integer bookId, String name,
                           Integer number, String author,
                           String publisher) {
        return bookDao.addBook(bookId,
                new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                number,
                new String(author.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(publisher.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
    }

    @Override
    public boolean updTimes(Integer bookId) {
        return bookDao.updTimes(bookId);
    }

    @Override
    public boolean setRet(Integer bookId, Integer uid) {
        return bookDao.setRet(bookId, uid);
    }


}
