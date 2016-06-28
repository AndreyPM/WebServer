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
import main.Publicetion;
import main.UserProfile;

/**
 *
 * @author exp
 */
public class LikePostServlet extends HttpServlet{
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
         String res = "{\"result\":\"error\"}";
        UserProfile profile;
         Publicetion publication;
       if(TestUserBase.UserList.get(request.getRequestedSessionId())!=null) {
           profile = TestUserBase.UserList.get(request.getRequestedSessionId());
           publication = TestUserBase.PublicationList.get(Integer.parseInt(request.getParameter("idPub")));
           publication.setLike();
           profile.setLikespost(publication.getId());
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            res = gson.toJson(publication);
        }else {
            res = "{\"result\":\"not login\"}";
        }
        
        response.getWriter().println(res);
        response.setContentType("text/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        
    }
}
