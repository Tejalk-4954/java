package in.sp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update_demo {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException{
	
	String city="dehradun";
	String email="sej@123";
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc4_db","root","tejal");
    PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
    ps.setString(1, city);
    ps.setString(2, email);
    
    int count = ps.executeUpdate();
    
    if(count>0)
    {
    	System.out.println("updated Successfully");
    }
    
    else
    {
    	System.out.println("failed to update");
    }
    con.close();
    }
}
