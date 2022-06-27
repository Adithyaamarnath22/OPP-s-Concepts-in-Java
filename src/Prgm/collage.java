package Prgm;

public class collage {
	public static void main(String args[]) {
		
		sdt obj=new sdt();
		obj.detail();
		obj.detail1();
		
	}
}


class student{
	public static void detail() {
		System.out.println();
		System.out.println("1");
		System.out.println("Athulya");
		System.out.println("BSc Electronics");
		System.out.println("Palikandi");
		System.out.println("1357687654");
	
	}
	
}

class sdt extends student{
	public static void detail1() {
		System.out.println();
		System.out.println("2");
		System.out.println("Shaithya");
		System.out.println("BBA");
		System.out.println("Koilandi");
		System.out.println("1543564761");
	}
}