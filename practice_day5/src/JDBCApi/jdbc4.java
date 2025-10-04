package JDBCApi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
				Class.forName("com.mysql.cj.jdbc.Driver");

				
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","tejal");
				
				
				CallableStatement call=con.prepareCall("{call getallstudents()}");
				/**
				 * {}=> it is a escape character, 
				 * it is a procedure call convert this into your appropriate syntax 
				 * ex:mysql 
				 */
				
				
				/**
				 * Delimiter is a symbol which tells the specific language or framework
				 * that the correct statement has  ended and you can  start your execution 
				 */
				ResultSet rs=call.executeQuery();
				
				System.out.println(rs !=null);
				
//				while(rs.next())
//				{
//					System.out.println(rs.getInt(1));
//				}

				 rs.close();
				 call.close();
				 con.close();
			}

		}