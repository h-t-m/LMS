package pers.h_t_m.LMS.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: h-t-m
 * @date: 2022/11/21 周一 23:41
 * @projectname: LMS
 * @description: 图书类
 * @IDE: IntelliJ IDEA
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    // 图书 ID
    private int bookId;
    // 书名
    private String name;
    // 数量
    private int number;
    // 作者
    private String author;
    // 出版社
    private String publisher;
    // 借出次数
    private int brTimes;
    // 购买日期
    private Timestamp buydate;
}