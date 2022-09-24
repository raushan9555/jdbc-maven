package jdbc_maven;

import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
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
		DAO dao=new DAO();
		String result=dao.savePerson(id, name, address, phone, pincode);
		System.out.println(result);
		

	}

}
