package pers.h_t_m.LMS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.h_t_m.LMS.dao.AppointmentDao;
import pers.h_t_m.LMS.dao.BookDao;
import pers.h_t_m.LMS.dao.UserDao;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.User;
import pers.h_t_m.LMS.service.UserService;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/23 周三 1:17
 * @projectname: LMS
 * @description:
 * @IDE: IntelliJ IDEA
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private AppointmentDao appointmentDao;


    public User getById(int uid) {
        return userDao.queryById(uid);
    }

    public List<User> getList() {
        return userDao.queryAll();
    }

    @Override
    public User checkUP(int uid, String passwd) {
        return userDao.checkUP(uid, passwd);
    }

    @Override
    public String checkAdmin(String passwd) {
        return userDao.checkAdmin(passwd);
    }

    @Override
    public boolean updateUser(Integer uid, String name,
                              String sex, Integer age,
                              Integer grade, Integer banji,
                              String major, String phone,
                              String password) {
        return userDao.updateUser(uid,
                new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(sex.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                age,
                grade,
                banji,
                new String(major.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(phone.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(password.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
    }

    @Override
    public boolean deleteUser(Integer uid) {
        return userDao.deleteUser(uid);
    }

    @Override
    public boolean addUser(Integer uid, String name,
                           String sex, Integer age,
                           Integer grade, Integer banji,
                           String major, String phone,
                           String password) {
        return userDao.addUser(uid,
                new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(sex.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                age,
                grade,
                banji,
                new String(major.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(phone.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8),
                new String(password.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
    }

    @Override
    public List<Appointment> queryByuid(Integer uid) {
        return appointmentDao.queryByuid(uid);
    }

    @Override
    public List<Appointment> queryAll() {
        return appointmentDao.queryAll();
    }
}
