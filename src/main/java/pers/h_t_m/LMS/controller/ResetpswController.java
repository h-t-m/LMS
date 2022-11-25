package pers.h_t_m.LMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: h-t-m
 * @date: 2022/11/23 周三 20:19
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Controller
//@RequestMapping("/reset")
public class ResetpswController {
    @RequestMapping("/resetpsw")
    private String resetpsw() {
        return "resetpsw";
    }
}
