package Polymorphism;

import java.util.Scanner;

public class polymorphism_overriding_Example {
public static void main(String args[]) {
	Scanner S =new Scanner(System.in);
	int a=4;
	int r =2;
	int l= 5;
Shape s=new Shape();
    s.Area();
circle c=new circle();
	c.Area(r);
	rectangle re=new rectangle();
	re.Area(l);
	square sq=new square();
	sq.Area(a);
}
}

