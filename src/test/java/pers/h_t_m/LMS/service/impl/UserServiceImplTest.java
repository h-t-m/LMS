package pers.h_t_m.LMS.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.h_t_m.LMS.pojo.User;
import pers.h_t_m.LMS.service.BookService;
import pers.h_t_m.LMS.service.UserService;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/23 周三 18:18
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UserServiceImplTest {
    @Autowired
    private UserService bookService;

    @Test
    public void testAppoint() {
        int bookId = 1;
        String studentId = "1234567";
        //boolean l = bookService.addUser(10, "看，解决顾客颅骨离开", "asf", "12342", "aw3s643q", "ashreahg", "SAGWESZGVAESz");
        System.out.println("areyhgbrteh");
        //System.out.println(l);
    }
}
