package pers.h_t_m.LMS.service;

import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.User;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/23 周三 0:20
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
public interface UserService {
    User getById(int uid);
    List<User> getList();
    User checkUP(int uid, String passwd);
    String checkAdmin(String passwd);
    boolean updateUser(Integer uid, String name,
                       String sex, Integer age,
                       Integer grade, Integer banji,
                       String major, String phone,
                       String password);
    boolean deleteUser(Integer uid);
    boolean addUser(Integer uid, String name,
                    String sex, Integer age,
                    Integer grade, Integer banji,
                    String major, String phone,
                    String password);

    List<Appointment> queryByuid(Integer uid);

    List<Appointment> queryAll();
}
