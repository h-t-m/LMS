package pers.h_t_m.LMS.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.h_t_m.LMS.service.BookService;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 1:25
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() {
        int bookId = 1;
        int studentId = 18301343;
        System.out.println(bookService.appoint(bookId, studentId));
    }

    @Test
    public void testReturn() {
        int bookId = 1;
        int studentId = 1;
        System.out.println(bookService.queryApById(bookId, studentId));
    }

    @Test
    public void testupdT() {
        int bookId = 1;
        System.out.println("sdagf" + bookService.updTimes(bookId));
    }
}
