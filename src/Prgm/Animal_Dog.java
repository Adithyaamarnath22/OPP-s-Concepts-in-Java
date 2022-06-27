package Prgm;

public class Animal_Dog {
	public static void main(String args[]) {
		D obj=new D();
		obj.Animal();
	     obj.Dog();
	}
}

class A{
	public static void Animal() {
		System.out.println("The Dog is a very useful and faithful Animal");
	}
	
}

class D extends A{
	public static void Dog() {
		System.out.println();
		System.out.println("Dog has good smelling power");
		System.out.println("Police keep dogs to trace thieves and criminals");
	}

}