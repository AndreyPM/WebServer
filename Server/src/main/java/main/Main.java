package main;


import Servlets.Frontend;
import Servlets.RegUserServlets;
import java.util.Scanner;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class Main {

    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();
        RegUserServlets reg= new RegUserServlets();
        
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(frontend), "/mirror");
        context.addServlet(new ServletHolder(reg), "/reg");
        
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
