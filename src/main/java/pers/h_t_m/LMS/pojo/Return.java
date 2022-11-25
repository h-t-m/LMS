package pers.h_t_m.LMS.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 23:37
 * @projectname: LMS
 * @description: 归还图书类
 * @IDE: IntelliJ IDEA
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Return {
    // 图书 ID
    private int bookId;
    // 学工号
    private int uid;
    // 归还时间
    private Date returnTime;
    // 归还图书
    private Book book;
}
