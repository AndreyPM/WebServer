package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Tools.AccountService;

public class RegUserServlets extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String res= AccountService.Registration(request); 
        response.getWriter().println(res);
        response.setContentType("text/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

    }



}
