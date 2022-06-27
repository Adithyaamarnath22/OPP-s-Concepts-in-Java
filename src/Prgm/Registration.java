package Prgm;

import java.util.Scanner;
 public class Registration {
  
	

	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
	  
	    
	    System.out.println("enter your name");
	    String name=S.next();
	    System.out.println("Enter your address");
	    String address=S.next();
	    System.out.println("Enter your contact number");
	    String ContactNumber=S.next();
	    System.out.println("Enter your email");
	    String Email=S.next();
	    System.out.println("Enter proofType");
	    String ProofType=S.next();
	    System.out.println("Enter proofId");
	    String ProofId=S.next();
	      Student_details std=new Student_details();
		std.details(name,address,ContactNumber,Email,ProofType,ProofId);
	    
	}
	void details(String Name, String Address, int ContactNumber, String Email, String ProofType, int ProofId) {
		// TODO Auto-generated method stub
	}
	}
	    
	
 
 
 
 
 
 
 
 
 
abstract class Regtr {
abstract void details(String Name,String Address,int ContactNumber,String Email,String ProofType,int ProofId);
public void registration() {
	System.out.println("registration");
	
}
void Student_details(String Name, String Address, int ContactNumber, String Email, String ProofType, int ProofId) {
	// TODO Auto-generated method stub

	}
}

	
	
