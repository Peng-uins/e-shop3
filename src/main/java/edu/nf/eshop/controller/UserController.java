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

/**
 * @author 0.0
 */
@WebServlet("/addUser")
public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int uid = Integer.parseInt(req.getParameter("uid"));
        String password = req.getParameter("password");
        UserSercive sercive = new UserSercive();
        int a = sercive.addUser(new Users(uid,password));
        String json = new Gson().toJson(a);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
