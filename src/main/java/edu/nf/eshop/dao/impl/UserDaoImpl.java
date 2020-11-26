package edu.nf.eshop.dao.impl;

import edu.nf.eshop.dao.UserDao;
import edu.nf.eshop.entity.Users;
import edu.nf.eshop.util.Util;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 0.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(Users users) {
        try(SqlSession sqlSession = Util.gteSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).addUser(users);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Users> gteUsers() {
        try(SqlSession sqlSession = Util.gteSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).gteUsers();
        } catch (Exception e) {
            throw e;
        }
    }
}
