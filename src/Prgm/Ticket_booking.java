package Prgm;

import java.util.Scanner;

public class Ticket_booking {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		booking_details st=new booking_details();
		System.out.println("Enter Price of a ticket:");
		st.setPrice(S.nextInt());
		System.out.println("Enter Number of Persons:");
	    st.setNumber(S.nextInt());
	    
		
		int n=st.getNumber();
//		int getNumber = 0;
		for(int i=1;i<=n;i++ ) {
	    System.out.printf("Enter Details for Person %d",i);
	    System.out.println();
		System.out.println("Name:");
		st.setName(S.next());
		System.out.println("Gender(M or F):");
		st.setGender(S.next());
		System.out.println("Age");
		st.setAge(S.nextInt());
		
		
		
		
	    }
		
	    st.show();
	}
	

}
