package Abstraction;

import java.util.Scanner;


public class Example{
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=S.next();
		System.out.println("Enter id:");
		int id=S.nextInt();
		student std=new student();
		std.totalmark(name,id);
		std.rank1();
	}
}