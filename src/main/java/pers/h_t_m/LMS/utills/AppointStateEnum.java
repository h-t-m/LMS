package pers.h_t_m.LMS.utills;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 1:23
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Getter
@AllArgsConstructor
public enum AppointStateEnum {
    SUCCESS(1, "预约成功"), FAILURE(0, "预约失败"), REPEAT(-1, "预约重复"), SYSTEMERROR(-2, "系统异常");

    private int state;
    private String stateInfo;

    /**
     * @param stat 状态码
     * @return
     * @description 获取状态码对应 enum
     * @date 2020/7/24 10:57
     * @author cunyu1943
     * @version 1.0
     */
    public static AppointStateEnum stateOf(int stat) {
        for (AppointStateEnum state : values()
        ) {
            if (stat == state.getState()) {
                return state;
            }
        }
        return null;
    }
}
