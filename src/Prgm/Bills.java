package Prgm;

import java.util.Scanner;

public class Bills {
public static void bill() {
	System.out.println("Please Enter the Teliphone Bill Details");
	System.out.println("---------------------------------------");
}
}
class Teliphone extends Bills{

	public static void bill() {
		
		Scanner S=new Scanner(System.in);
		
		System.out.println("Enter the Teliphone Bill Number:");
	    int n=S.nextInt();
	    System.out.println("Enter the Customer Name:");
	    String n1=S.next();
	    System.out.println("Enter the Number of Calls Made:");
	    int n2=S.nextInt();
	    System.out.println("Enter the Cost Per Call:");
	    int n3=S.nextInt();
	    
	    double a1=n2*n3;
	

	    	System.out.println("\t Teliphone Bill Details");
	    	System.out.println("\t ----------------------");
			System.out.println("Bill Number:"+n);
	    	System.out.println("Customer Name:"+n1);
	  
		System.out.println("Teliphone Bill Cost:"+a1);
	}
}


class Current extends Bills{
public static void bill() {
	
	  Scanner S=new Scanner(System.in);
	System.out.println();
    System.out.println("Please Enter the Current Bill Details");
    System.out.println("-------------------------------------");
    System.out.println();
  
    
	System.out.println("Enter the Current Bill Number:");
	int m=S.nextInt();
    System.out.println("Enter the Customer Name:");
    String m1=S.next();
    System.out.println("Enter the Number of Units Consumed:");
    int m2=S.nextInt();
    System.out.println("Enter the Cost Per Unit:");
    int m3=S.nextInt();
    
    double a2=m2*m3;
    System.out.println();
    System.out.println("\tCurrent Bill Details");
    System.out.println("\t--------------------");
    System.out.println("Bill Number:"+m);
    System.out.println("Customer Name:"+m1);
    
    System.out.println("Current Bill Details"+a2);
    
}
	
}





