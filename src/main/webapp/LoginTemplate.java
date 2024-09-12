package main.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
//
//@WebServlet("/Login")
//public class LoginTemplate extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        res.setContentType("text.html");
//        PrintWriter out = res.getWriter();      // now we want to read the login html form
//        InputStream inputStream = getServletContext().getResourceAsStream("/scratch.html");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//
//        String line;
//        while((line = reader.readLine())!=null){
//            out.println(line);
//        }
//
//
//        reader.close();
//
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }
//}
