package JDBCApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String name;
		int id;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name::");
		name=sc.nextLine();
		
		System.out.println("please enter the id::");
		id=sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc::mysql://localhost:3306/Demo","root","tejal");
	    
	    System.out.println("***Connection open***");
	    
	    try(con)
	    {
	    	Statement stmt=con.createStatement();
	    	
	    }
	}
}
