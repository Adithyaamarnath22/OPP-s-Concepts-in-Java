package Prgm;

import java.util.Scanner;

public class Shopping {
public static void main(String args[]) {
	Scanner S=new Scanner(System.in);
	Dress d =new Dress();
	d.show();
	System.out.println("Enter your Dress");
	String dd=S.next();
	int sa=0; int ku=0;int le=0; int go=0; int je=0;int sh=0;
	do {
		if(dd.equalsIgnoreCase("Saree"))
		{
			sa=3500;
		}
		else if(dd.equalsIgnoreCase("Kurtis"))
		{
			ku=750;
		}
		else if(dd.equalsIgnoreCase("Lehenga"))
		{
			le=2000;
		}
		else if (dd.equalsIgnoreCase("Gown"))
		{
			go=1500;
		}
		else if (dd.equalsIgnoreCase("Jeans"))
		{
			je=1000;
		}
		else if (dd.equals("ShortTops")) 
		{
			sh=900;
		}
		else {
			System.out.println("Try Again");
	}}
		while(dd.equals(""));
			d.show(sa,ku,le,go,je,sh);
		}
	

}

class Dress{
	public void show() {
	    System.out.println("Saree :");
		System.out.println("Kurti :");
		System.out.println("Lehenga :");
		System.out.println("Gown :");
		System.out.println("Jeans :");
		System.out.println("ShortTop :");
		

}
public void show(int sa, int ku, int le, int go, int je, int sh) {
	int total=sa+ku+le+go+je+sh;
	System.out.println("Total:"+total);
	}
}
