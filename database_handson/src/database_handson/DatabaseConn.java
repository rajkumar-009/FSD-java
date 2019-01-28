package database_handson;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer", "root", "root");
			
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from cust_info");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
			}
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				con.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	
	}

}
