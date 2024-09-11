package main.webapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

//1st way by implementing the Servlet interface
@WebServlet("/test")
public class NewServletApp implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>This is my first Servelet program! </h2>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }



}











//2nd way by extending the GenericServlet class-->  which basically implements the Servlet interface and provides the service() method to be invoked by the web container

//@WebServlet("/test")
//public class NewServletApp extends GenericServlet {
//
//    @Override
//    public void service(ServletRequest servletRequest, ServletResponse res) throws ServletException, IOException {
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        out.println("<html>");
//        out.println("<body>");
//        out.println("<h2>This is my first Servelet program! </h2>");
//        out.println("</body>");
//        out.println("</html>");
//    }




