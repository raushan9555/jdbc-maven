package jdbc_maven;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile id");
		int id=sc.nextInt();
		m.setId(id);
		System.out.println("Enter name ");
		String name=sc.next();
		m.setName(name);
		System.out.println("brand");
		String brand=sc.next();
		m.setBrand(brand);
		System.out.println("Enter colour");
		String colour=sc.next();
		m.setColour(colour);
		System.out.println("Enter price");
		double price=sc.nextDouble();
		m.setPrice(price);
		System.out.println("Enter ram");
		int ram=sc.nextInt();
		m.setRam(ram);
		System.out.println("Enter manufacturer");
		String mnfctr=sc.nextLine();
		m.setManufacturer(mnfctr);
		MobileDriver

	}

}
