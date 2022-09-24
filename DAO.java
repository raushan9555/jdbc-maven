package jdbc_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/jdbcprc";
	String username = "root";
	String password = "root";
	Connection connection=null;
	public String savePerson(Person p) {
		String query="insert into person values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
			//String query=("insert into bike values(?,?,?,?,?)");
			//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, p.getId());
			ps.setString(2,p.getName());
			ps.setString(3,p.getAddress());
			ps.setLong(4,p.getPhone());
			ps.setInt(5,p.getPin());
			int rows=ps.executeUpdate();
			if(rows==1) {
				return "Saved";
			}
			return "Not Saved";
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Saved";
		}
	public String updatePersonobj(Person p) {
		String query="update person set name=?,address=?,phone=?,pincode=? where id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
			//String query=("insert into bike values(?,?,?,?,?)");
			//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setString(1,p.getName());
			ps.setString(2,p.getAddress());
			ps.setLong(3,p.getPhone());
			ps.setInt(4,p.getPin());
			int rows=ps.executeUpdate();
			if(rows==1) {
				return "Updated";
			}
			return "Not Updated";
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Updated";
	}
	
	public Person getPersonobj(int id) {
		String query="Select * from person where id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
			//String query=("insert into bike values(?,?,?,?,?)");
			//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, id);
			//ResultSet rs=new ResultSet();
			Person person=new Person();
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				person.setId(rs.getInt(1));
				person.setName(rs.getString(2));
				person.setAddress(rs.getString(3));
				person.setPhone(rs.getLong(4));
				person.setPin(rs.getInt(5));
			}
			return person;
		}
			
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
		
	public String savePerson(int id,String name,String address,long phone,int pincode) {
		String query="insert into person values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
			//String query=("insert into bike values(?,?,?,?,?)");
			//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3,address);
			ps.setLong(4,phone);
			ps.setInt(5,pincode);
			int rows=ps.executeUpdate();
			if(rows==1) {
				return "Saved";
			}
			return "Not Saved";
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Saved";
		}
	public String updatePerson(int id,String name,String address,long phone,int pincode) {
		String query="update person set name=?,address=?,phone=?,pincode=? where id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
			//String query=("insert into bike values(?,?,?,?,?)");
			//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,address);
			ps.setLong(3,phone);
			ps.setInt(4,pincode);
			int rows=ps.executeUpdate();
			if(rows==1) {
				return "Updated";
			}
			return "Not Updated";
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Updated";
	}
	public String deletePerson(int id,String name,String address,long phone,int pincode) {
		String query="delete from person where id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
			//String query=("insert into bike values(?,?,?,?,?)");
			//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,address);
			ps.setLong(3,phone);
			ps.setInt(4,pincode);
			int rows=ps.executeUpdate();
			if(rows==1) {
				return "Deleted";
			}
			return "Not Deleted";
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Not Deleted";
	}
	
		
}



