package Inheritance;

public class Multilevel_inheritance{
public static void main(String args[]) {
	f obj=new f();
	obj.clg();
	obj.Department();
	obj.cls();
}
}

class d{
	public static void clg() {
		System.out.println("IHRD");
	}
}
class e extends d{
	public static void Department() {
		System.out.println("commerce");
	}
}
class f extends e{
	public static void cls() {
		System.out.println("B.com");
		System.out.println("BBA");
	}
}