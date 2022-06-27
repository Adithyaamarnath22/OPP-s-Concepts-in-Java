package Prgm;
import java.util.Scanner;

public class Shapes {
	public static void main(String arg[]) {
		Scanner S=new Scanner(System.in);
		System.out.println(" Shape");
		System.out.println("-------");
		
	    System.out.println("Circle");
	   
	   
	    System.out.println("Cube:");
	    
	  
	    shape1 St=new shape1();
	    St.detail();
	    St.details();
	    shape2 St1=new shape2();
	    St1.detail();
	    St1.details();
	}

}



class shape1 implements Point{

		public void details() {
		int r =4;
		// TODO Auto-generated method stub
		double area1=3.14*r*r;;
		
	    System.out.println("Area of a Circle:"+area1);
	}
	

	@Override
	public void detail() {
		int r=4;
		// TODO Auto-generated method stub
		double perimeter=2*3.14*r;
		System.out.println("Perimeter of a Circle:"+perimeter);
	}
}

class shape2 implements Point{

	@Override
	public void detail( ) {
		int s=3;
		// TODO Auto-generated method stub
		double volume=s*s*s;
		System.out.println("Volume of a Cube:"+volume);
	}

	@Override
	public void details() {
		int s=3;
		// TODO Auto-generated method stub
		double perimeter1=12*s;
		System.out.println("Perimeter of a Cube:"+perimeter1);
	}

}