package pers.h_t_m.LMS.dao;

import org.apache.ibatis.annotations.Param;
import pers.h_t_m.LMS.pojo.Appointment;
import pers.h_t_m.LMS.pojo.Book;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author: h-t-m
 * @date: 2022/11/21 周一 23:47
 * @projectname: LMS
 * @description: Book 接口
 * @IDE: IntelliJ IDEA
 */
public interface BookDao {

    /**
     * @date: 2022/11/22 0:03
     * @description: 根据 id 查找图书
     */
    Book queryById(@Param("bookId") int bookId);

    /**
     * @date: 2022/11/22 0:05
     * @description: 查找所有图书，参数用于限制范围，等价于 SQL 语句 LIMIT 语法
     */
    List<Book> queryAll();

    /**
     * @date: 2022/11/22 0:15
     * @description: 借阅之后更新数据
     */
    int reduceNumber(@Param("bookId") int bookId);

    List<Appointment> queryApById(@Param("uid") Integer uid, @Param("bookId") Integer bookId);

    boolean returnBook(@Param("bookId") Integer bookId);

    boolean updateAppoint(@Param("uid") Integer uid, @Param("bookId") Integer bookId);

    boolean updateBook(@Param("bookId") Integer bookId,
                       @Param("name") String name,
                       @Param("number") Integer number,
                       @Param("author") String author,
                       @Param("publisher") String publisher);

    boolean deleteBook(@Param("bookId") Integer bookId);

    boolean addBook(@Param("bookId") Integer bookId,
                    @Param("name") String name,
                    @Param("number") Integer number,
                    @Param("author") String author,
                    @Param("publisher") String publisher);

    boolean updTimes(@Param("bookId") Integer bookId);
    boolean setRet(@Param("bookId") Integer bookId, @Param("uid") Integer uid);
}
