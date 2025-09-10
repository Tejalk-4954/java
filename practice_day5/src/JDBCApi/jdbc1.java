package JDBCApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");//throws ClassNotFoundException
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","tejal");//throws SQLException
		
		Statement stmt=con.createStatement();
		String sql="create table student(id int primary key,name varchar(50) unique key);";
	    
		 boolean result=stmt.execute(sql); 
		 //Execute => DDL and DQL
		 
		
		 System.out.println(result+"False");
		 
		 con.close();
		
	
	}
}
