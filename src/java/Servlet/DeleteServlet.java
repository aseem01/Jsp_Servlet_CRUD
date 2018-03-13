
package Servlet;
import Com.Model.All_Method;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteEmployee")
public class DeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        System.out.println("before checker");
        String sid=request.getParameter("id");
        System.out.println("delete id : "+sid);
        int id=Integer.parseInt(sid);
        
        All_Method model=new All_Method();
        int status=model.delete(id);
        response.sendRedirect("DisplayEmployee");
    }

}
