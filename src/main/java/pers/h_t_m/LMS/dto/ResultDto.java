package pers.h_t_m.LMS.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 1:26
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Data
@NoArgsConstructor
public class ResultDto<T> {
    // 是否预约成功
    private boolean success;
    // 预约成功返回的数据
    private T data;
    // 错误信息
    private String error;

    // 预约成功的构造器
    public ResultDto(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    // 预约失败的构造器
    public ResultDto(boolean success, String error) {
        this.success = success;
        this.error = error;
    }
}
