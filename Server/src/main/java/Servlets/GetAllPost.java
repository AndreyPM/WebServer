/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Test.TestUserBase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author exp
 */
public class GetAllPost extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String res = "{\"result\":\"error\"}";
         if(TestUserBase.UserList.get(request.getRequestedSessionId())!=null) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            res = gson.toJson(TestUserBase.PublicationList);
         }else {
            res = "{\"result\":\"not login\"}";
        }
        response.getWriter().println(res);
        response.setContentType("text/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
