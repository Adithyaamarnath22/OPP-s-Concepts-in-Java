package Prgm;

public class Details {
	
	String Number;
	String Name;
	String Address;
	String ContactNumber;
    String Email;
    String ProofType;
    String ProofId;
    int na=0,ad=0,cn=0,em=0,pt=0,pi=0;
    
	public String getNumber() {
		return Number;
	}
	
	public void setNumber(String number) {

		Number = number;
	}
	public String getName() {
		return Name;
	}

	public boolean setName( String name) {
		if(name.matches("^[a-z A-Z]*$"))
	{
			this.Name=name;
		return true;
	}
		
	else
	{
		na++;
		return false;
	}
		
	}
	public String getAddress() {
		
		return Address;

	}
	public boolean setAddress(String address) {
		if(address.matches("^[a-z A-Z 0-9]*$")) {
			
			this.Address=address;
		return true;
	}
	else {
		
		ad++;
		return false;}
		
	}
	public String getContactNumber() {
		return ContactNumber;
		}
	public boolean setContactNumber(String contactNumber) {
		if(contactNumber.matches("^[0-9]*$")) {
			this.ContactNumber=contactNumber;
			return true;
			
		}
			else {
				
				cn++;
				return false;
			}
	
	}
	
	public String getEmail() {
		return Email;
	}
	public boolean setEmail(String email) {
	if(email.matches("^[0-9a-z@.com]*$")) {
		this.Email=email;
		return true;
	}
		else {
			em++;
		return false;	
		}
		}
	
	public String getProofType() {
//		return ProofType;
		
		return ProofType;
		
		}
	

	public boolean setProofType(String proofType) {
		if (proofType.matches("^[a-z A-Z]*$")) {
			this.ProofType=proofType;
			
		return true;
		}
			else {
			
				pt++;
				return false;
			}
	}
	public String getProofId() {
		return ProofId;
		}
	public boolean setProofId(String proofId) {	
		if(proofId.matches("^[0-9]*$")) {
		this.ProofId=proofId;
			return true;
	}
	else {
		pi++;
		return false;
	}
		}	
	
	public  void show() {
		 System.out.println(getName());
		System.out.println(getAddress());
		System.out.println(getContactNumber());
		System.out.println(getEmail());
		System.out.println(getProofType());
		System.out.println(getProofId());
	}

	public  void display()
	{
	if(na==0&& ad==0 && cn==0 && em==0 && pt==0 && pi==0 ) {
	System.out.println(" Successful");
	show();
    
	
    }
    else {
	System.out.println("Not successful");
	
	if(na==1) {
		System.out.println("invalid name");
	}
    if(ad==1) {
    System.out.println("invalid address");
    }
    if(cn==1) {
	System.out.println("invalid contact number");
    }
    if(em==1) {
	System.out.println("invalid email");
    }
    if (pt==1) {
	System.out.println("invalid proof type");
    }
    if (pi==1) {
	System.out.println("invalid proof id");
   }
	}
	}

	

	
}
