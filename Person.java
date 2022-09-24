package jdbc_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Person {
	private int id;
	private String name;
	private String address;
	private long phone;
	private int pin;
	Person()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin =pin; 
	}
	Connection connection=null;
	public Person(int id, String name, String address, long phone, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pin = pin;
		this.connection = connection;
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
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", pin=" + pin
				+ ", connection=" + connection + "]";
	}
	
	

}
