package Servlet;

import Com.Model.All_Method;
import Entity_Class.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditEmployee")
public class EditServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
         PrintWriter out=response.getWriter();
         //out.print("I'm EditEmployeeServlet");
        String sid=request.getParameter("id");
       
        
        int id=Integer.parseInt(sid);
        All_Method method=new All_Method();
        
        User user=method.getEmployeeId(id);
        request.setAttribute("userdoc", user);
        System.out.println("FirstName : "+user.getFirstname());
        System.out.println("LastName : "+user.getLastname());
        //out.println("id : "+sid);
       // System.out.println("sid : "+sid);
       RequestDispatcher rd=request.getRequestDispatcher("Edit.jsp");
       rd.forward(request, response);

    }

}
