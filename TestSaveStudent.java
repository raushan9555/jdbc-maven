package jdbc_maven;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.CallableStatement;

public class TestSaveStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
		  Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
		  CallableStatement cs=connection.prepareCall("call getstudent()");
		  ResultSet rs=cs.executeQuery();
		  while(rs.next()) {
			  System.out.print(rs.getInt(1)+" ");
			  System.out.print(rs.getString(2)+" ");
			  System.out.print(rs.getString(3)+" ");
			  System.out.print(rs.getString(4)+" ");
			  System.out.println(rs.getString(5)+" ");
		  }
		  System.out.println("Got it!!");
		  connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
