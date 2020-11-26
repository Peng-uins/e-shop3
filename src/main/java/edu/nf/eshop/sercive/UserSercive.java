package edu.nf.eshop.sercive;

import edu.nf.eshop.dao.UserDao;
import edu.nf.eshop.dao.impl.UserDaoImpl;
import edu.nf.eshop.entity.Users;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

import java.util.List;

/**
 * @author 0.0
 */
public class UserSercive {
    public int addUser(Users users){
        UserDao dao = new UserDaoImpl();
        return dao.addUser(users);
    }

    public List<Users> gteUsers(){
        UserDao dao = new UserDaoImpl();
        return dao.gteUsers();
    }
}
