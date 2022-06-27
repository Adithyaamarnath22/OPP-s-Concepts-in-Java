package Polymorphism;

public class Shape {
public static void Area() {
	
	System.out.println("Area of the Shapes");
    }
}

class square extends Shape{

	public static void Area(int a) {
	
		double a3=a*a;
		System.out.println("Area of a Square:");
	
		System.out.println(a3);
	}
}

class circle extends Shape{
	public static void Area(int r) {
		double a1=3.14*r*r;
		System.out.println("Area of a Circle:");
		System.out.println(a1);
	}
}

class rectangle extends Shape{
	public static void Area(int l) {
		int b=2;
		
		double a2=l*b;
		System.out.println("Area of a Rectangle:");
		System.out.println(a2);
	}
}