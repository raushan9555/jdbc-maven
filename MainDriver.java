package jdbc_maven;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DAO dao=new DAO();
		boolean condition=true;
		while(condition) {
		System.out.println("1.Add Person\n2.Update Details\n3.Delete\n4.GetDetails");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			System.out.println("Enter Person Id :");
			int id=sc.nextInt();
			System.out.println("Enter Name :");
			String name=sc.next();
			sc.nextLine();
			System.out.println("Enter  Address :");
			String address=sc.nextLine();
			System.out.println("Enter Phone");
			long phone=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Pincode");
			int pincode=sc.nextInt();
			String result=dao.savePerson(id, name, address, phone, pincode);
			System.out.println(result);
			break;
		case 2:
			System.out.println("Enter Person Id :");
			id=sc.nextInt();
			System.out.println("Enter Name :");
			name=sc.next();
			sc.nextLine();
			System.out.println("Enter  Address :");
			address=sc.nextLine();
			System.out.println("Enter Phone");
			phone=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Pincode");
			pincode=sc.nextInt();
		String u=dao.updatePerson(id, name, address, phone, pincode);
		System.out.println(u);
		case 3:
			System.out.println("Enter Person Id :");
			id=sc.nextInt();
			System.out.println("Enter Name :");
			name=sc.next();
			sc.nextLine();
			System.out.println("Enter  Address :");
			address=sc.nextLine();
			System.out.println("Enter Phone");
			phone=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Pincode");
			pincode=sc.nextInt();
		String d=dao.deletePerson(id, name, address, phone, pincode);
		System.out.println(d);
		case 4:
			System.out.println("Enter Person Id :");
			id=sc.nextInt();
			
		Person p =dao.getPersonobj(id);
		System.out.println(p);
		  }
		}
	  }
	}
