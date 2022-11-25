package pers.h_t_m.LMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pers.h_t_m.LMS.dto.AppointDto;
import pers.h_t_m.LMS.dto.ResultDto;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.Book;
import pers.h_t_m.LMS.pojo.User;
import pers.h_t_m.LMS.service.BookService;
import pers.h_t_m.LMS.service.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/23 周三 0:13
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;

    @PostMapping
    private String login(@RequestParam("uid") Integer uid, @RequestParam("passwd") String passwd, Model model) {
        User user = null;
        try {
            user = userService.checkUP(uid, passwd);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (user == null) {
            return "404";
        }

        model.addAttribute("user", user);

        List<Appointment> appointList = userService.queryByuid(uid);
        model.addAttribute("appointList", appointList);

        List<Book> bookList = bookService.getList();
        model.addAttribute("bookList", bookList);
        return "user";
    }
}
