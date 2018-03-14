package com.funix.servlet;

import com.funix.db.MapData;
import com.funix.model.UserInfor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        String confirmpassword = request.getParameter("confirmpassword");
        MapData map = MapData.getInstance();
        UserInfor user = new UserInfor(userName, passWord);
        request.removeAttribute("errorRegister");

        if (!passWord.equals(confirmpassword)) {
            request.setAttribute("errorRegister", "<p style=\" color: red\">" + "Password is not macth" + "</p>");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
            dispatcher.forward(request, response);
        } else if (map.isExistUser(userName)) {
            request.setAttribute("errorRegister", "<p style=\" color: red\">" + "User is existing" + "</p>");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
            dispatcher.forward(request, response);

        } else if (userName.isEmpty() || passWord.isEmpty() || confirmpassword.isEmpty()) {
            request.setAttribute("errorRegister", "<p style=\" color: red\">" + "Username or Password is not empty" + "</p>");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
            dispatcher.forward(request, response);
        } else if (!validateUserName(user)) {

            request.setAttribute("errorRegister", "<p style=\" color: red\">" + "Username or Password is wrong format" + "</p>");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
            dispatcher.forward(request, response);
        } else {
            map.addUser(user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
            dispatcher.forward(request, response);

        }

    }

    // Check username and passwod
    public boolean validateUserName(UserInfor user) {
        String userNamePattern1 = "\\w{6,}";
        String userNamePattern2 = "(?=.*[$#@%^&*])";
        String passwodPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+*=])(?=\\S+$).{8,}";
        return user.getUserName().matches(userNamePattern1)
                && !user.getUserName().matches(userNamePattern2)
                && user.getPassWord().matches(passwodPattern);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
