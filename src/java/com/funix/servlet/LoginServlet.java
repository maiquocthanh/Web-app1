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
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        MapData map = MapData.getInstance();
        UserInfor user = new UserInfor(userName, passWord);
        HttpSession session = request.getSession();
        session.removeAttribute("errorLogin");
        session.removeAttribute("isFirst");
        if (userName != null && passWord != null && map.doLogin(user)) {
            Integer count = (Integer) session.getAttribute("count");
            if (count == null) {
                count = 0;
            }
             
            count++;
            if (count == 1) {
                session.setAttribute("isFirst", true);
            }
            session.setAttribute("username", userName);
            session.setMaxInactiveInterval(60);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            session.setAttribute("count", count);
        } else {
            request.setAttribute("errorLogin", "<p style=\" color: red\">" + "Username or Password is wrong" + "</p>");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
            dispatcher.forward(request, response);
        }

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
    }// </editor-fold>

}
