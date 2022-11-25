package pers.h_t_m.LMS.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.h_t_m.LMS.pojo.Book;
import pers.h_t_m.LMS.pojo.User;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/23 周三 18:14
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryById() {
        int bookId = 1;
        String pw = "abc1234567";
        User book = userDao.checkUP(bookId, pw);
        System.out.println("ID 对应的图书信息：" + book);
    }

    @Test
    public void testQueryAll() {
        List<User> bookList = userDao.queryAll();
        System.out.println("所有图书信息：");
        for (User book : bookList) {
            System.out.println(book);
        }

    }

    @Test
    public void testReduceNumber() {
        int uid = 1;
        String passwd = "1234567";
        User update = userDao.checkUP(uid, passwd);
        System.out.println("update = " + update);
    }
}
