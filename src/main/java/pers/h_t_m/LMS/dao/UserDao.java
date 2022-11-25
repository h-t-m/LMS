package pers.h_t_m.LMS.dao;

import org.apache.ibatis.annotations.Param;
import pers.h_t_m.LMS.pojo.User;

import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/22 周二 23:45
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
public interface UserDao {

    User queryById(@Param("uid") int uid);

    List<User> queryAll();
    User checkUP(@Param("uid") int uid, @Param("passwd") String passwd);

    String checkAdmin(@Param("passwd") String passwd);

    boolean updateUser(@Param("uid") Integer uid, @Param("name") String name, @Param("sex") String sex, @Param("age") Integer age, @Param("grade") Integer grade, @Param("banji") Integer banji, @Param("major") String major, @Param("phone") String phone, @Param("password") String password);

    boolean deleteUser(@Param("uid") Integer uid);

    boolean addUser(@Param("uid") Integer uid, @Param("name") String name, @Param("sex") String sex, @Param("age") Integer age, @Param("grade") Integer grade, @Param("banji") Integer banji, @Param("major") String major, @Param("phone") String phone, @Param("password") String password);
}
