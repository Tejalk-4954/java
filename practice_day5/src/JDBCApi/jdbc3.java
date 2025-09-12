package JDBCApi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class jdbc3 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			String name;
			int id;
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","tejal");
			
			System.out.println("Connection opened::");
			try(con)
			{
//				Statement stmt=con.createStatement();
				
				PreparedStatement stmt2=con.prepareStatement("delete from student where id =3;");
//				String sql="insert into student values(?,?);";
			    
				boolean flag=stmt2.execute();
				
//				 int i=stmt2.executeUpdate(); //integer. DDL,DML
				
				 System.out.println(flag);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(con.isClosed());
		}
	

}

