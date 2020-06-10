package ictgradschool.project.servlet.action;

import ictgradschool.project.DAO.UserDAO;
import ictgradschool.project.util.AuthenticationUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SignIn", urlPatterns = {"/signIn"})
public class SignIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); // do not support
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        try {
            if (AuthenticationUtil.authenticate(UserDAO.getUserFromUserName(userName), password)) {
                req.getSession(true).setAttribute("loggedInUserName", userName);
                req.getRequestDispatcher("/Index").forward(req, resp);
            } else {
                req.setAttribute("hasLogInFailed", true);
                req.getRequestDispatcher("/WEB-INF/jsp/signIn.jsp").forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
