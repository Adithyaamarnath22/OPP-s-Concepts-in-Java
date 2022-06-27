package Prgm;

public class Student_details extends Registration {

	
	@Override
	void details(String Name, String Address, int ContactNumber, String Email, String ProofType, int ProofId) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+Name);
		System.out.println("Address:"+Address);
		System.out.println("ContactNumber:"+ContactNumber);
		System.out.println("Email:"+Email);
		System.out.println("ProofType:"+ProofType);
		System.out.println("ProofId:"+ProofId);
		
	}

	public void details(String name, String address, String contactNumber, String email, String proofType,
			String proofId) {
		// TODO Auto-generated method stub
		System.out.println(name);
	    System.out.println(address);
	    System.out.println(contactNumber);
	    System.out.println(email);
	    System.out.println(proofType);
	    System.out.println(proofId);
	    System.out.println("Thank you for your Registration");
	}

	public void registration() {
		// TODO Auto-generated method stub
		
	}

	
	

}
