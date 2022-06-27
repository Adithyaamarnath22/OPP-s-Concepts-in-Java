package Inheritance;

public class Simple_Inheritance {
	public static void main(String args[]) {
		
	B1 Obj= new B1();
	Obj.show(); 
		
	Obj.disp();	
		
	}
}

class A1{
	public static void show() {
		System.out.println(" I'm Parent class ");
	}
}

class B1 extends A1{


  public static void disp()
	{
		System.out.println("I'm child class");
	}



	}

	


