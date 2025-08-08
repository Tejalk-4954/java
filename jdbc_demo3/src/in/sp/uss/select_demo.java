package in.sp.uss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select_demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc4_db","root","tejal");
		
		PreparedStatement ps = con.prepareStatement("select name from register where email='sej@123'");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			String name = rs.getString("name");
			System.out.println("Name:"+name);
		}
		
		rs.close();
		ps.close();
		con.close();
	}

}
