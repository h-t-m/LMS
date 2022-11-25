package pers.h_t_m.LMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.JavaScriptUtils;
import pers.h_t_m.LMS.dto.AppointDto;
import pers.h_t_m.LMS.dto.ResultDto;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.Book;
import pers.h_t_m.LMS.service.BookService;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 1:26
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    // url：ip:port:/book/list
    @GetMapping("/list")
    private String list(Model model) {
        List<Book> bookList = bookService.getList();
        model.addAttribute("bookList", bookList);
        return "list";
    }

    @GetMapping(value = "/{bookId}/detail")
    private String detail(@PathVariable("bookId") Integer bookId, Model model) {
        if (bookId == null) {
            return "redirect:/book/list";
        }

        Book book = bookService.getById(bookId);
        if (book == null) {
            return "forward:/book/list";
        }

        model.addAttribute("book", book);
        return "detail";
    }

    //ajax 传递 json 数据到前端
    @PostMapping
    private  String borrow(@RequestParam("uid") Integer uid, @RequestParam("bookId") Integer bookId, Model model) {
        if (uid == null) {
            return "404";
        }
        if (bookId == null) {
            return "404";
        }

        List<Appointment> appointment = null;
        try {
            appointment = bookService.queryApById(uid, bookId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (appointment.isEmpty() || appointment.get(appointment.size() - 1).ret) {
            AppointDto appointDto = null;
            try {
                appointDto = bookService.appoint(bookId, uid);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!bookService.updTimes(bookId))
                return "404";
            model.addAttribute("appointDto", appointDto);
            return "book";
        } else {
            return "dont";
        }
    }

    @PostMapping(value = "/return")
    private String Return(@RequestParam("uid") Integer uid, @RequestParam("bookId") Integer bookId) {
        if (uid == null) {
            return "404";
        }
        if (bookId == null) {
            return "404";
        }
        List<Appointment> appointment = null;
        try {
            appointment = bookService.queryApById(uid, bookId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (appointment.isEmpty()) {
            return "dontbr";
        }

        if (bookService.retBook(uid, bookId) && bookService.setRet(bookId, uid))
            return "return";
        else
            return "404";
    }
}
