package pers.h_t_m.LMS.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.h_t_m.LMS.pojo.Appointment;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 0:56
 * @projectname: LMS
 * @description: AppointmentDao 测试类
 * @IDE: IntelliJ IDEA
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class AppointmentDaoTest {
    @Autowired
    AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() {
        int bookId = 2;
        int uid = 18301333;
        int insert = appointmentDao.insertAppointment(bookId, uid);
        System.out.println("Insert = " + insert);
    }

    @Test
    public void testQueryByKeyWithBook(){
        int bookId = 2;
        int uid = 1;
        List<Appointment> appointment=appointmentDao.queryByuid(uid);
        System.out.println(appointment);
        //System.out.println(appointment.getBook());
    }
}
