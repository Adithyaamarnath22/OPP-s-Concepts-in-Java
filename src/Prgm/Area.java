package Prgm;

import java.util.Scanner;

public class Area{
	public static void main(String args[]) {
		 Scanner S = new Scanner(System.in);
		  
	        System.out.println("Enter the length:");
	        int a = S.nextInt();
	        System.out.println("Enter value of width:");
	        int b = S.nextInt();
	        Rectangle rect = new Rectangle();
	        Rectangle.rectangle(a, b);
	        System.out.println("Rectangle");
	        
	        
	        
			System.out.println("Triangle");
			System.out.println("enter the width");
			int a1 =S.nextInt();
			System.out.println("enter the height");
			int b1=S.nextInt();
            Triangle tri=new Triangle();
            tri.triangle(a1, b);
	       
	        	
	}
}


class Rectangle extends Area{
	public static void rectangle(int a,int b) {   
		    {
		        int area = a* b;
		    }
		}
	}

		class Triangle extends Area
		{
		    public static void triangle(int a, int b)
		    {
		        float area = (float) 0.5 * a * b;
		       
		    }

		   
		}

class Square extends Rectangle{
	public static void square(int a) {
		int area = 4*a;
	}
}










