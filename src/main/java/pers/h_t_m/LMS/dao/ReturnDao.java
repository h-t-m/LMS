package pers.h_t_m.LMS.dao;

import org.apache.ibatis.annotations.Param;
import pers.h_t_m.LMS.pojo.Appointment;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 23:44
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
public interface ReturnDao {
    Appointment queryById(@Param("uid") Integer uid, @Param("bookId") Integer bookId);
}
