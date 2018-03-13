package Servlet;

import Com.Model.All_Method;
import Entity_Class.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayEmployee")
public class DisplayServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        All_Method method = new All_Method();
        List<User> list = method.GetAllEmployee();
        request.setAttribute("list", list);
        RequestDispatcher rd=request.getRequestDispatcher("DisplayEmployeeList.jsp");
        rd.forward(request, response);
    }

}
