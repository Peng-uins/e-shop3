package edu.nf.eshop.controller;

import com.google.gson.Gson;
import edu.nf.eshop.entity.Users;
import edu.nf.eshop.sercive.UserSercive;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 0.0
 */
@WebServlet("/list")
public class UserControllerGte extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserSercive sercive = new UserSercive();
        List<Users> list = sercive.gteUsers();
        list.forEach(u-> System.out.println(u.getUId()));
        String json = new Gson().toJson(list);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
