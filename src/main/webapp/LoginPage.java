package main.webapp;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/")                // for default page,   index.jsp
@WebServlet("/Loginform")       // here Loginform is the name of the servlet... earlier this mapping was done using web.xml file in the WEB-INF folder
public class LoginPage extends HttpServlet {
    static String uname ;
    static String pass ;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        req.getRequestDispatcher("/index.html").forward(req, res);            // used to include the response from another resource (servlet, JSP, HTML, etc.)
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();

//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Login Page</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h2> Login Form </h2>");
//        out.println("<form action=\"Loginform\" method=\"post\">");              // or   out.println("<form action='LoginPage' method='post'>");
//        out.println("<label for=\"username\">Username</label>");
//        out.println("<input type=\"text\" id=\"username\" name=\"username\" required> <br> <br>");
//        out.println("<label for=\"password\">Password</label>");
//        out.println("<input type=\"password\" id=\"password\" name=\"password\" required> <br> <br>");
//        out.println("<input type=\"submit\" value=\"Login\">");                     // as soon as you click login, it will call the doPost method to the Loginform servlet
//        out.println("</form>");
//        out.println("<script>console.log('doGet method called');</script>"); //to print on the browser console
//        out.println("</body>");
//        out.println("</html>");

    }


    // when we click on login button, it will call this method as a request(HttpServletRequest req)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<br><br>");
        out.println("<h2>");
        uname = req.getParameter("username");
        pass = req.getParameter("password");

        out.println("<script>console.log('doPost method called');</script>"); // Log to browser console
        out.println("<script>console.log('Username: " + uname + "');</script>"); // Log username
        out.println("<script>console.log('Password: " + pass + "');</script>"); // Log password

            if(uname.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")){
                out.println("Logged in Successfully...!");
                out.println("<a href = './credentials'>Get credentials</a>");
            }else{
                out.println("Login Failed...!");
            }


        out.println("</h2>");
        out.println("<br><br>");
        out.println("<a href = '/ServletApp'>Go Back to Login</a>"); // Add get credentials button when logged in successfully
        out.println("</body>");
        out.println("</html>");
    }
}


