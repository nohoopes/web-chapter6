package webapp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import webapp.User;

@WebServlet(name = "email", value = "/email")
public class EmailListServlet extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest request ,
                       HttpServletResponse response)
                 throws ServletException, IOException
                 {
                    String url = "/index.jsp";


         String action = request.getParameter("action");
         if (action == null) {
             action = "join";
         }

         if (action.equals("join")) {
             url = "/index.jsp";
             System.out.println(url);
         }
         else if (action.equals("add")) {
             String firstName = request.getParameter("firstname");
             String lastName = request.getParameter("lastname");
             String email = request.getParameter("email");
             String heardFrom = request.getParameter("Heardfrom");
             String updates = request.getParameter("updates");
             String contactVia = request.getParameter("contactVia");
             User user = new User (firstName,lastName,email,heardFrom,updates,contactVia);
             request.setAttribute("user", user);
             url = "/thanks.jsp";
             System.out.println(url);
         }

         getServletContext()
              .getRequestDispatcher(url)
              .forward(request, response) ;
 }
         @Override
         protected void doGet (HttpServletRequest request,
                              HttpServletResponse response)
               throws ServletException, IOException {
             doPost (request, response);
         }
}