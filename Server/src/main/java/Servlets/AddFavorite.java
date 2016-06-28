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
import main.UserProfile;

/**
 *
 * @author exp
 */
public class AddFavorite extends HttpServlet{
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(TestUserBase.UserList.get(request.getRequestedSessionId())!=null){
        UserProfile user = TestUserBase.UserList.get(request.getRequestedSessionId());
        user.setFpub(Integer.parseInt(request.getParameter("id")));
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        response.getWriter().println(gson.toJson(user));
        }else {
            response.getWriter().println("{\"result\":\"not login\"}");
        }


        response.setContentType("text/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
