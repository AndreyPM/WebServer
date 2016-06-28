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
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.Publicetion;
import main.UserProfile;
/**
 *
 * @author exp
 */
public class AddPostServlets extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String res = "{\"result\":\"error\"}";
        UserProfile profile;
        if(TestUserBase.UserList.get(request.getRequestedSessionId())!=null)  {
        profile = TestUserBase.UserList.get(request.getRequestedSessionId());
        Publicetion publication = new Publicetion();
        publication.setId();
        publication.setIdUser(profile.getId());
        publication.setIdCat(Integer.parseInt(request.getParameter("idCat")));
        publication.setCountUser(Integer.parseInt(request.getParameter("countUser")));
        Date theEnd = new Date(Long.MAX_VALUE);
        DateFormat dateFormat = SimpleDateFormat.getDateTimeInstance(SimpleDateFormat.LONG, SimpleDateFormat.LONG);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        publication.setTime(dateFormat.format(theEnd));
        publication.setTimeInWork(request.getParameter("timeInWork"));
        publication.setMaterial(request.getParameter("material"));
        publication.setContent(request.getParameter("content"));
        TestUserBase.PublicationList.put(publication.getId(), publication);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        res = gson.toJson(publication);
        } else {
            res = "{\"result\":\"not login\"}";
            
        }
        
        response.getWriter().println(res);
        response.setContentType("text/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }
    
}
