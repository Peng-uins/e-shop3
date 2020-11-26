package edu.nf.eshop.dao;

import edu.nf.eshop.entity.Users;

import java.util.List;

/**
 * @author 0.0
 */
public interface UserDao  {
    /**
     * 添加用户
     * @param users
     * @return
     */
    int addUser(Users users);

    /**
     *
     * @return
     */
    List<Users> gteUsers();

}
