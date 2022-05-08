package com.indiabix.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudDb {

	public static void main(String[] args) {
		String dbURL= "jdbc:mysql://127.0.0.1:3306/CG1";
		String username="root";
		String password="awesomehj@79";
		
		try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="Select *from Employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				
				String name=r.getString(2);
				String password1=r.getString(3);
				String email1=r.getString(4);
				String result =" USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email1));
			}
				con.close();
		}
		
			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="DELETE FROM Employee22 WHERE user_id=2";
			PreparedStatement s=con.prepareStatement(sql);
			int rows=s.executeUpdate();
			
			if(rows>0)
			{
				System.out.println("A new User information deleted successfully");
			}
			con.close();
			*/
			
		
			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="Select *from Employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				
				String name=r.getString(2);
				String password1=r.getString(3);
				String email1=r.getString(4);
				String result =" USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email1));
			}
			con.close();
			*/
		
			
			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="UPDATE Employee22 SET user_name=?,password=? WHERE user_id=1";
			/*PreparedStatement s=con.prepareStatement(sql);
			
			s.setString(1, "hrithik12");
			s.setString(2, "9823@jain");
			
			
			
			int rows=s.executeUpdate();
		
			if(rows>0)
			{
				System.out.println("A new User information entered successfully");
			}
			con.close();
			*/
		
			/*Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				
				String name=r.getString(2);
				String password1=r.getString(3);
				String email1=r.getString(4);
				String result =" USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email1));
			}
			con.close();
			*/
		
			/*String sql="INSERT INTO Employee22(user_name,password,email)values(?,?,?)";
			PreparedStatement s=con.prepareStatement(sql);
			
			s.setString(1, "Hrithik_j12");
			s.setString(2, "Pass@123");
			s.setString(3, "Hrithik@gmail.com");
			
			int rows=s.executeUpdate();
		
			if(rows>0)
			{
				System.out.println("A new User information entered successfully");
			}
			con.close();
			*/
		
		catch(SQLException e)
		{
			System.out.println("Exception occurred "+e);
		}

}
}