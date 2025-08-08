package in.sp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("driver loaded successfully");
      
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc4_db?useSSL=false","root","tejal");
	PreparedStatement ps = con.prepareStatement("insert into register(name,email,city,gender) values (?,?,?,?)");
	ps.setString(1, "sejal");
	ps.setString(2, "sej@123");
	ps.setString(3,"pune");
	ps.setString(4,"female");
	ps.executeUpdate();
	
  con.close();
  }
}
