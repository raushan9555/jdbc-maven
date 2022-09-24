package jdbc_maven;

import java.util.Scanner;

public class DAO1Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DAO1 dao=new DAO1();
		Product p=new Product();
		boolean condition=true;
		while(condition) {
		System.out.println("1.Add Person\n2.Update Details\n3.Delete\n4.GetDetails");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) 
		{
					/*{
						private int productId;
						private String productNumber;
						private double price;
						private String manufacturer;
						private String discount;
						private String warranty;
						private String manufacturingDate;
						
						private String GST;
					}*/
		case 1:
			System.out.println("Enter Product Id :");
			int productId=sc.nextInt();
			System.out.println("Enter Product Number :");
			String productNumber=sc.next();
			sc.nextLine();
			System.out.println("Enter  manufacturer name :");
			String manufacturer=sc.nextLine();
			System.out.println("Enter Discount");
			String discount=sc.next();
			sc.nextLine();
			System.out.println("Enter warranty");
			String warranty=sc.nextLine();
			System.out.println("Enter manufacturing date");
			String manufacturingDate=sc.nextLine();
			String result=dao.saveProductobj(productId,productNumber,manufacturer,discount,warranty,manufacturingDate);
			System.out.println(result);
			break;
		case 2:
			System.out.println("Enter Product Id :");
			int productId=sc.nextInt();
			System.out.println("Enter Product Number :");
			String productNumber=sc.next();
			sc.nextLine();
			System.out.println("Enter  manufacturer name :");
			String manufacturer=sc.nextLine();
			System.out.println("Enter Discount");
			String discount=sc.next();
			sc.nextLine();
			System.out.println("Enter warranty");
			String warranty=sc.nextLine();
			System.out.println("Enter manufacturing date");
			String manufacturingDate=sc.nextLine();
		String u=dao.updatePersonobj(productId,productNumber,manufacturer,discount,warranty,manufacturingDate);
		System.out.println(u);
		break;
		case 3:
			System.out.println("Enter Product Id :");
			productId=sc.nextInt();
			System.out.println("Enter Product Name :");
			ProductName=sc.next();
			sc.nextLine();
			System.out.println("Enter  Address :");
			address=sc.nextLine();
			System.out.println("Enter Phone");
			phone=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Pincode");
			pincode=sc.nextInt();
		String d=dao.deleteProductobj(id);
		System.out.println(d);
		case 4:
			System.out.println("Enter Product Id :");
			id=sc.nextInt();
			
		Product p =dao.getProductobj(id);
		System.out.println(p);
		  }
		}
	  }
	}


}
