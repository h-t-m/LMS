package pers.h_t_m.LMS.dao;

import org.apache.ibatis.annotations.Param;
import pers.h_t_m.LMS.pojo.Appointment;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 0:16
 * @projectname: LMS
 * @description: 预约接口
 * @IDE: IntelliJ IDEA
 */
public interface AppointmentDao {
    /**
     * @date: 2022/11/22 0:17
     * @description: 新增预约
     */
    int insertAppointment(@Param("bookId") int bookId, @Param("uid") int uid);

    /**
     * @date: 2022/11/22 0:19
     * @description: 查询预约并返回预约类对象，内含图书类对象
     */
    List<Appointment> queryByKeyWithBook(@Param("bookId") int bookId, @Param("uid") int uid);

    List<Appointment> queryByuid(@Param("uid") int uid);

    List<Appointment> queryAll();
}
