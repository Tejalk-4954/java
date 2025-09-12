package JDBCApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String name;
		int id;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the name:");
		name=scan.nextLine();
		
		System.out.println("please enter the id:");
		id=scan.nextInt();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","tejal");
		
		System.out.println("Connection opened::");
		try(con)
		{
//			Statement stmt=con.createStatement();
			
			PreparedStatement stmt2=con.prepareStatement("insert into student values(?,?);");
//			String sql="insert into student values(?,?);";
		    
			stmt2.setInt(1, id);
			stmt2.setString(2, name);
			
			 int i=stmt2.executeUpdate(); //integer. DDL,DML
			
			 
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(con.isClosed());
	}
}
