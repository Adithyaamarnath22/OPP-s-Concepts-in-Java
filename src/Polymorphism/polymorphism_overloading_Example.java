package Polymorphism;

public class polymorphism_overloading_Example {
public static void main(String args[]) {
	Add(5,3);
	Add(6);
	Add(3,4,5);
	Add("Shai");
}

private static void Add(String a) {
	// TODO Auto-generated method stub
	System.out.println(a);
}

private static void Add(int i, int j, int k) {
	// TODO Auto-generated method stub
	int a=i+j+k;
	System.out.println(a);
}

private static void Add(int i) {
	// TODO Auto-generated method stub
	int a=i+10;
	System.out.println(a);
}

private static void Add(int i, int j) {
	// TODO Auto-generated method stub
	int a=i-j;
	System.out.println(a);
}
	
	
	
}
