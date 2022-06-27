package Inheritance;

public class Hierarchial_inheritance{
public static void main(String args[]) {
	B obj=new B();
	obj.detail();
	obj.rslt();
	
	C objt=new C();
	objt.details();
	objt.result();
	
}
}
class A{
	public static void result() { 
		System.out.println("pass");
	}
    public static void rslt() {
	    System.out.println("failed");
}
}

class B extends A{
	public static void detail() {
		System.out.println("Athulya");
		System.out.println("BSc Electronics");
		System.out.println("2nd Year");
		System.out.println("3rd Sem");
	}
}
class C extends A{
	public static void details() {
		System.out.println("Unnimaya");
		System.out.println("BBA");
		System.out.println("2nd Year");
		System.out.println("3rd Sem");
	}
}