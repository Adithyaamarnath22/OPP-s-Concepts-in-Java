package Prgm;

import java.util.Scanner;


public class Guest_regestration {
	public static void main(String arg[]) {
	Scanner S=new Scanner(System.in);
    Details st=new Details();
    System.out.println("Enter the number");
    st.setNumber(S.next());
    System.out.println("enter your name");
    st.setName(S.next());
    System.out.println("Enter your address");
    st.setAddress(S.next());
    System.out.println("Enter your contact number");
    st.setContactNumber(S.next());
    System.out.println("Enter your email");
    st.setEmail(S.next());
    System.out.println("Enter proofType");
    st.setProofType(S.next());
    System.out.println("Enter proofId");
    st.setProofId(S.next());
    
   
    st.display();
    
//    System.out.println("number:"+st.getNumber());
//    System.out.println("name:"+st.getName());
//    System.out.println("address:"+st.getAddress());
//    System.out.println("contact number:"+st.getContactNumber());
//    System.out.println("email:"+st.getEmail());
//    System.out.println("prooftype:"+st.getProofType());
//    System.out.println("proofid:"+st.getProofId());
//    
}

}
