package Com.Model;

import DBConnection.DBConnection;
import Entity_Class.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class All_Method {
    
    public List<User> GetAllEmployee() {
        List<User> list = new ArrayList();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            DBConnection db = new DBConnection();
            conn = db.DBConnection();
            pst = conn.prepareStatement("SELECT * FROM user");
            rs = pst.executeQuery();
           
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setFirstname(rs.getString(3));
                user.setLastname(rs.getString(4));
                user.setUserAge(rs.getString(5));
                user.setContact(rs.getString(6));
                user.setTelephone(rs.getString(7));
                user.setPosition(rs.getString(8));
                user.setColor(rs.getString(9));
                list.add(user);
                
                
            }
        } catch (Exception e) {
            e.toString();
        }
        return list;
    }
    
    
    public User getEmployeeId(int id)
    {
        boolean status=false;
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        User user=new User();
        DBConnection db=new DBConnection();
        try
        {
             conn=db.DBConnection();
             pst=conn.prepareStatement("select *from user where id=?");
             pst.setInt(1, id);
             rs=pst.executeQuery();
             if(rs.next())
             {
                 user.setId(rs.getInt(1));
                 user.setUsername(rs.getString(2));
                 user.setFirstname(rs.getString(3));
                 user.setLastname(rs.getString(4));
                 user.setUserAge(rs.getString(5));
                 user.setContact(rs.getString(6));
                 user.setTelephone(rs.getString(7));
                 user.setPosition(rs.getString(8));
                 user.setColor(rs.getString(9));
                 
             }
             System.out.println("first name : "+user.getFirstname());
             System.out.println("last name : "+user.getLastname());
             conn.close();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }
    
    
    public int update(User user)
    {
        int status=0;
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        DBConnection db=new DBConnection();
        try
        {
            conn=db.DBConnection();
            pst=conn.prepareStatement("update user set username=?,firstname=?,lastname=?,user_age=?,contact=?,telephone=?,position=?,color=? Where id=?");
            System.out.println("update method  id : "+user.getId());
           
            pst.setString(1,user.getUsername());
            pst.setString(2, user.getFirstname());
            pst.setString(3,user.getLastname());
            pst.setString(4,user.getUserAge());
            pst.setString(5,user.getContact());
            pst.setString(6,user.getTelephone());
            pst.setString(7,user.getPosition());
            pst.setString(8,user.getColor());
             pst.setInt(9,user.getId());
            status=pst.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
    
    
    
    public int delete(int id)
    {
        int status=0;
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        DBConnection db=new DBConnection();
        try
        {
            conn=db.DBConnection();
            pst=conn.prepareStatement("delete from user where id=?");
            pst.setInt(1, id);
            status=pst.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
    
    
    
}
