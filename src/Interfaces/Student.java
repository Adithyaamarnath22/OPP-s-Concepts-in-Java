package Interfaces;

import java.util.Scanner;

public class Student {
	public static void main(String args[])
	{
	Scanner S =new Scanner(System.in);
	System.out.println("Enter the Name:");
	String name=S.next();
	System.out.println("Enter the Id:");
	int id=S.nextInt();
	System.out.println("Enter the Department:");
	String dep=S.next();
	System.out.println("Enter the Year:");
	int year=S.nextInt();
	System.out.println("Enter the Total:");
	int total=S.nextInt();
    student1 St=new student1();
    St.detail(name, id,dep,year);
    St.total(total);
}
}


interface rank{
	public void  detail(String name,int id,String dep,int year);
}

interface total{
	public void total(int total);
}

class student1 implements rank,total
{
	@Override
	public void total(int total) {
		// TODO Auto-generated method stub
		System.out.println("Total:"+total);
	}



	@Override
	public void detail(String name, int id, String dep,int year) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+name);
		System.out.println("Student Id:"+id);
		System.out.println("Department"+dep);
		System.out.println("Year"+year);	
	}


}
