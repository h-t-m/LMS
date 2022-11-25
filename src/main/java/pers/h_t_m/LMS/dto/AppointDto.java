package pers.h_t_m.LMS.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.utills.AppointStateEnum;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 1:23
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Data
@NoArgsConstructor
public class AppointDto {
    private int bookId;
    // 状态码
    private int state;
    // 状态信息
    private String stateInfo;
    // 预约成功的对象
    private Appointment appointment;

    //    预约失败的构造器
    public AppointDto(int bookId, AppointStateEnum appointStateEnum) {
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo = appointStateEnum.getStateInfo();
    }

    //    预约成功的构造器
    public AppointDto(int bookId, AppointStateEnum appointStateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo = appointStateEnum.getStateInfo();
        this.appointment = appointment;
    }
}
