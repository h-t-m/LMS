package pers.h_t_m.LMS.service;

import pers.h_t_m.LMS.dto.AppointDto;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.Book;

import java.util.Date;
import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 1:24
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
public interface BookService {
    /**
     * @param bookId 图书 ID
     * @return 对应 ID 的图书
     * @description 根据图书 id 查询图书
     * @date 2020/7/24 11:41
     * @author cunyu1943
     * @version 1.0
     */
    Book getById(int bookId);

    /**
     * @param
     * @return 所有图书的列表
     * @description 获取图书列表
     */
    List<Book> getList();

    /**
     * @param bookId    图书 id
     * @param uid 学生 Id
     * @return
     * @description 返回预约结果
     */
    AppointDto appoint(int bookId, int uid);
    List<Appointment> queryApById(int uid, int bookId);

    boolean retBook(int uid, int bookId);

    boolean updateBook(Integer bookId, String name,
                       Integer number, String author,
                       String publisher);
    boolean deleteBook(Integer bookId);
    boolean addBook(Integer bookId, String name,
                    Integer number, String author,
                    String publisher);

    boolean updTimes(Integer bookId);

    boolean setRet(Integer bookId, Integer uid);
}
