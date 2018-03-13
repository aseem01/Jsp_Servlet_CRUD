package Servlet;
import DBConnection.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String userage = request.getParameter("userage");
        String contact = request.getParameter("contact");
        String telephone = request.getParameter("telephone");
        String position = request.getParameter("position");
        String color=request.getParameter("color");
        out.println("username : " + username);
        out.println("firstname : " + firstname);
        out.println("lastname : " + lastname);
        out.println("userage : " + userage);
        out.println("contact : " + contact);
        out.println("telephone : " + telephone);
        out.println("position : " + position);
        out.println("color : "+color);
        
        boolean status=false;
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        
        
        try
        {
           DBConnection db=new DBConnection();
           conn=db.DBConnection();
           pst=conn.prepareStatement("insert into user(username,firstname,lastname,user_age,contact,telephone,position,color) values(?,?,?,?,?,?,?,?)");
           pst.setString(1,username);
           pst.setString(2, firstname);
           pst.setString(3, lastname);
           pst.setString(4, userage);
           pst.setString(5, contact);
           pst.setString(6,telephone);
           pst.setString(7, position);
           pst.setString(8, color);
           int i=pst.executeUpdate();
            System.out.println("i is : "+i);
           if(i>0) out.print("You Successfully registered");
           
        }
        catch(SQLException e)
        {
            System.out.println("error : "+e.toString());
        }
        out.close();
        
    }
    
}
