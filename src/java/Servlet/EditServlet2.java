package Servlet;

import Com.Model.All_Method;
import Entity_Class.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditEmployeee")
public class EditServlet2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sid = request.getParameter("id");
        String username = request.getParameter("username");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String userage = request.getParameter("userage");
        String contact = request.getParameter("contact");
        String telephone = request.getParameter("telephone");
        String position = request.getParameter("position");
        String color = request.getParameter("color");

//        System.out.println("id : " + sid);
//        System.out.println("username : " + username);
//        System.out.println("firstname : " + firstname);
//        System.out.println("lastname : " + lastname);
//        System.out.println("userage : " + userage);
//        System.out.println("contact : " + contact);
//        System.out.println("telephone : " + telephone);
//        System.out.println("position : " + position);
//        System.out.println("color : " + color);

        User user = new User();

        // user.setId(id);
        int id = Integer.parseInt(sid);

        user.setId(id);
        user.setUsername(username);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setUserAge(userage);
        user.setContact(contact);
        user.setTelephone(telephone);
        user.setPosition(position);
        user.setColor(color);
        All_Method model = new All_Method();
       // System.out.println("Before Update method call");
        int status=0;
        status = model.update(user);
        //System.out.println("After update call : " + status);
        if (status > 0) {
            response.sendRedirect("DisplayEmployee");
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("DisplayEmployeeList.jsp");
            rd.forward(request, response);
        }

    }

}
