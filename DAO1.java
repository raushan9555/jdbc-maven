package jdbc_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO1 {
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbcprc";
		String username = "root";
		String password = "root";
		Connection connection=null;
		public Product saveProductobj(Product p) {
			String query="insert into product values(?,?,?,?,?,?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
				//String query=("insert into bike values(?,?,?,?,?)");
				//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
				Product pr=new Product();
				PreparedStatement ps= connection.prepareStatement(query);
				ps.setInt(1, p.getProductId());
				ps.setString(2,p.getProductNumber());
				ps.setDouble(3,p.getPrice());
				ps.setString(4,p.getManufacturer());
				ps.setString(5,p.getDiscount());
				ps.setString(5,p.getWarranty());
				ps.setString(5,p.getManufacturingDate());
				ps.setString(5,p.getGST());
				int rows=ps.executeUpdate();
				if(rows==1) {
					return pr ;
				}
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
		public Product updateProductobj(Product p) {
			String query="update product set Product_Id=?,Product_Number=?,Price=?,Manufacturer=?,Discount=?,Warranty=?,ManufacturingDate=?,GST=? where id=?";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
				//String query=("insert into bike values(?,?,?,?,?)");
				//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");

				Product pr=new Product();
				PreparedStatement ps= connection.prepareStatement(query);
				ps.setInt(1, p.getProductId());
				ps.setString(2,p.getProductNumber());
				ps.setDouble(3,p.getPrice());
				ps.setString(4,p.getManufacturer());
				ps.setString(5,p.getDiscount());
				ps.setString(6,p.getWarranty());
				ps.setString(7,p.getManufacturingDate());
				ps.setString(5,p.getGST());
				int rows=ps.executeUpdate();
				if(rows==1) {
					return pr ;
				}
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
		
		public Product getProductobj(int id) {
			String query="Select * from product where Product_Id=?";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
				//String query=("insert into bike values(?,?,?,?,?)");
				//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
				PreparedStatement ps= connection.prepareStatement(query);
				ps.setInt(1, id);
				//ResultSet rs=new ResultSet();
				Product pr=new Product();
				
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					pr.setProductId(rs.getInt(1));
					pr.setProductNumber(rs.getString(2));
					pr.setPrice(rs.getDouble(3));
					pr.setManufacturer(rs.getString(4));
					pr.setDiscount(rs.getString(5));
					pr.setWarranty(rs.getString(6));
					pr.setManufacturingDate(rs.getString(7));
					pr.setGST(rs.getString(8));	
				}
				return pr;
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
		public String deleteProductobj(int id) {
			String query="delete from product where Product_Id=?";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Connection connection=DriverManager.getConnection("localhost:3306","root","root");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306  /jdbcprc","root","root");
				//String query=("insert into bike values(?,?,?,?,?)");
				//st.execute("INSERT INTO jdbcprc.student VALUES(1,'VINOD','0987654334','Bangalore','561007')");
				PreparedStatement ps= connection.prepareStatement(query);
				ps.setInt(1, id);
				int a=ps.executeUpdate();
				if(a==1) {
					return "deleted";
				}
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


}
