package pers.h_t_m.LMS.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.h_t_m.LMS.pojo.Book;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 0:55
 * @projectname: LMS
 * @description: BookDao 测试类
 * @IDE: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class BookDaoTest {
    // 自动注入
    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryById() {
        int bookId = 1;
        Book book = bookDao.queryById(bookId);
        System.out.println("ID 对应的图书信息：" + book);
    }

    @Test
    public void testQueryAll() {
        List<Book> bookList = bookDao.queryAll();
        System.out.println("所有图书信息：");
        for (Book book : bookList) {
            System.out.println(book);
        }

    }

    @Test
    public void testReduceNumber() {
        int bookId = 3;
        int uid = 3;
        //int update = bookDao.updTimes(bookId);
        bookDao.updTimes(bookId);
        System.out.println("update = ");
    }
}
