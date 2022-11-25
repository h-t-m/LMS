package pers.h_t_m.LMS.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.Book;
import pers.h_t_m.LMS.pojo.User;
import pers.h_t_m.LMS.service.BookService;
import pers.h_t_m.LMS.service.UserService;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/24 周四 17:54
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;

    @GetMapping("/login")
    private String login() {
        return "login";
    }
    @PostMapping
    private String admin(@RequestParam("passwd") String passwd, Model model) {
        if (userService.checkAdmin(passwd) == null)
            return "404";
        else {
            List<User> userList = userService.getList();
            List<Book> bookList = bookService.getList();
            List<Appointment> appointList = userService.queryAll();
            model.addAttribute("userList", userList);
            model.addAttribute("bookList", bookList);
            model.addAttribute("appointList", appointList);
            return "admin";
        }
    }
    @PostMapping(value = "/updateUser")
    private String updateUser(@RequestParam("uid") Integer uid,
                              @RequestParam("name") String name,
                              @RequestParam("sex") String sex,
                              @RequestParam("age") Integer age,
                              @RequestParam("grade") Integer grade,
                              @RequestParam("banji") Integer banji,
                              @RequestParam("major") String major,
                              @RequestParam("phone") String phone,
                              @RequestParam("password") String password,
                              Model model) {
        if (userService.updateUser(uid, name, sex, age, grade, banji, major, phone, password)) {
            User user = userService.getById(uid);
            model.addAttribute("user", user);
            return "updSus";
        }
        return "404";
    }

    @PostMapping(value = "/updateBook")
    private String updateBook(@RequestParam("bookId") Integer bookId,
                              @RequestParam("name") String name,
                              @RequestParam("number") Integer number,
                              @RequestParam("author") String author,
                              @RequestParam("publisher") String publisher,
                              Model model) {
        if (bookService.updateBook(bookId, name, number, author, publisher)) {
            Book book = bookService.getById(bookId);
            model.addAttribute("book", book);
            return "updBok";
        }
        return "404";
    }

    @PostMapping(value = "/deleteUser")
    private String deleteUser(@RequestParam("uid") Integer uid, Model model) {
        if (userService.deleteUser(uid)) {
            model.addAttribute("uid", uid);
            return "delUser";
        }
        return "404";
    }

    @PostMapping(value = "/deleteBook")
    private String deleteBook(@RequestParam("bookId") Integer bookId, Model model) {
        if (bookService.deleteBook(bookId)) {
            model.addAttribute("bookId", bookId);
            return "delBok";
        }
        return "404";
    }

    @PostMapping(value = "/addUser")
    private String addUser(@RequestParam("uid") Integer uid,
                           @RequestParam("name") String name,
                           @RequestParam("sex") String sex,
                           @RequestParam("age") Integer age,
                           @RequestParam("grade") Integer grade,
                           @RequestParam("banji") Integer banji,
                           @RequestParam("major") String major,
                           @RequestParam("phone") String phone,
                           @RequestParam("password") String password,
                           Model model) {
        if (userService.getById(uid) != null)
            return "404";

        if (userService.addUser(uid, name, sex, age, grade, banji, major, phone, password)) {
            User user = userService.getById(uid);
            model.addAttribute("user", user);
            return "addSus";
        }
        return "404";
    }

    @PostMapping(value = "/addBook")
    private String addBook(@RequestParam("bookId") Integer bookId,
                           @RequestParam("name") String name,
                           @RequestParam("number") Integer number,
                           @RequestParam("author") String author,
                           @RequestParam("publisher") String publisher,
                           Model model) {
        if (bookService.getById(bookId) != null)
            return "404";

        if (bookService.addBook(bookId, name, number, author, publisher)) {
            Book book = bookService.getById(bookId);
            model.addAttribute("book", book);
            return "addBok";
        }
        return "404";
    }
}
