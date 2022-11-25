package pers.h_t_m.LMS.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: h-t-m
 * @date: 2022/11/21 周一 23:41
 * @projectname: LMS
 * @description: 用户抽象类
 * @IDE: IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    // 学工号
    private Integer uid;
    // 姓名
    private String name;
    // 性别
    private String sex;
    // 年龄
    private Integer age;

    // 年级
    private Integer grade;
    // 班级
    private Integer banji;
    // 专业
    private String major;
    // 手机号
    private String phone;
    // 密码
    private String password;
}
