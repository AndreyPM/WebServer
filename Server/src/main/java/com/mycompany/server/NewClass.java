package com.mycompany.server;

import javax.servlet.Servlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 *
 * @author exp
 */
public class NewClass {

    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();

        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        context.addServlet(new ServletHolder((Servlet) frontend), "/authform");
    
    server.start();
        server.join();
    }
}
