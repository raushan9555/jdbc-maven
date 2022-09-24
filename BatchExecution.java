package jdbc_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchExecution {

	public static void main(String[] args) throws SQLException {
		List<Person> list=new ArrayList<Person>();
		//int id, String name, String address, long phone, int pin
		Person person=new Person(3,"Ram","HAL",9122112211l,560017);
		Person person1=new Person(4,"Vikram","HAL",912233311l,560017);
		Person person2=new Person(5,"Vinod","HAL",9122144441l,560017);
		Person person3=new Person(6,"Raman","HAL",9122555511l,560017);
		Person person4=new Person(7,"Raghav","HAL",9122666611l,560017);
		list.add(person);
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		System.out.println(list);
		//jdbc code
		
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbcprc";
		String username = "root";
		String password = "root";
		Connection connection=null;
		String query="insert into person values(?,?,?,?,?)";
		try {
		Class.forName(path);
		connection=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=connection.prepareStatement(query);
			for(Person p:list) {
				ps.setInt(1,p.getId());
				ps.setString(2,p.getName());
				ps.setString(3,p.getAddress());
				ps.setLong(4,p.getPhone());
				ps.setLong(5,p.getPin());
			ps.addBatch();	
			}
			ps.executeBatch();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}catch(ClassNotFoundException e) {
		 e.printStackTrace();	
		}
		finally {
			connection.close();
		  }
	}
}
		

	
