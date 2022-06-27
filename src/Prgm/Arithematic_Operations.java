package Prgm;

import java.util.Scanner;

public class Arithematic_Operations {
	

	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		
	    add obj =new add();
	    obj.Arithematicoperation();

	System.out.println("enter your choice:");
	int ch=S.nextInt();
	
	
//	Object multi;
	sub ob=new sub();
	multi objt = new multi();
	if(ch==1||ch==2) {
		System.out.println("enter the 1st number");
		int a1=S.nextInt();
		System.out.println("enter the 2nd number");
		int b1=S.nextInt();
		ob.Arithematic(a1, b1,ch);
	}
	else if(ch==3||ch==4||ch==5) {
		System.out.println("enter the 1st number");
		int a1=S.nextInt();
		System.out.println("enter the 2nd number");
		int b1=S.nextInt();
		
	objt.Operation(a1, b1,ch);
	}
	else 
		System.out.println("not found");
	}
}

class add{
	
	public static void Arithematicoperation() {
		
		System.out.println("1 Addition");
		System.out.println("2 Subtraction");
		System.out.println("3 Multplication");
		System.out.println("4 Division");
		System.out.println("5 Moduless");

}
}

class sub extends add{
	public static void Arithematic(int a,int b,int ch) {
		
	if(ch==1) {
		int c=a+b;
		
		System.out.println("result="+c);}
	else if(ch==2) {
	int d=a-b;
	System.out.println("result="+d);}
	}
}
class multi extends add{
	public static void Operation(int a,int b,int ch) {
		if(ch==3) {

int e=a*b;
System.out.println("result="+e);}
		else if(ch==4) {
		
int f=a/b;
System.out.println("result="+f);}
		else {
int g=a%b;
System.out.println("result="+g);
		}
}
}