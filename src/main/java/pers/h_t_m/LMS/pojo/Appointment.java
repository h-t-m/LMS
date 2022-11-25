package pers.h_t_m.LMS.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: h-t-m
 * @date: 2022/11/21 周一 23:43
 * @projectname: LMS
 * @description: 借阅图书类
 * @IDE: IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    // 图书 ID
    private int bookId;
    // 学工号
    private int uid;
    // 借阅时间
    private Timestamp appointTime;
    // 归还时间
    private Timestamp returnTime;
    // 是否归还
    public boolean ret;
    // 借阅图书
    private Book book;
}
