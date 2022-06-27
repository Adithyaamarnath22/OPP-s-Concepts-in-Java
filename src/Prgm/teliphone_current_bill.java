package Prgm;

import java.util.Scanner;

public class teliphone_current_bill {


public static void main(String args[]) {
	Scanner S =new Scanner(System.in);
	
	
	Bills B=new Bills();
	B.bill();
	Teliphone T=new Teliphone();
	Teliphone.bill();
	Current C=new Current();
	C.bill();
}
}
