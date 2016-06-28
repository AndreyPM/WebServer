package main;


import Servlets.AddCommentServlet;
import Servlets.AddFavorite;
import Servlets.AddPostServlets;
import Servlets.RegUserServlets;
import Test.TestUserBase;
import java.util.Scanner;
import javax.servlet.Servlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class Main {

    public static void main(String[] args) throws Exception {
        UserProfile user = new UserProfile();
        
        
        user.setBackgroundFoto("back");
        user.setFoto("foto");
        user.setId(TestUserBase.plus());
        user.setToken("11111111");
        user.setUserName("vasya");
        TestUserBase.UserList.put("fgdg", user);
        user = null;
        
        
        RegUserServlets reg= new RegUserServlets();
        AddFavorite favorite = new AddFavorite();
        AddPostServlets addpost = new AddPostServlets();
        AddCommentServlet addCommentServlet = new AddCommentServlet();
        
        
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
 
        
        context.addServlet(new ServletHolder(addpost), "/addpost");
        context.addServlet(new ServletHolder(reg), "/reg");
        context.addServlet(new ServletHolder(favorite), "/addfavorite");
        context.addServlet(new ServletHolder(addCommentServlet), "/addcomment");
        
        
        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        
        
        System.out.println("Server started");
        System.out.println("Enter '1' for stoped server");
         Scanner in = new Scanner(System.in);
        if(in.nextInt()==1){
            server.stop();
            server.destroy();
            System.out.println("Server stoped");
        }
        server.join();
              
        
    }
}
