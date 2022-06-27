package Prgm;

public class Teacher_student {
	public static void main(String args[]) {
	
	B obj=new B();	
	obj.collage();
	obj.Teacher();
	
	C objt=new C();
	objt.Student();
	}
}

class A1{
	public static void collage() {
		System.out.println("Collage of Applied Science");
		System.out.println("Vazhakkad");
	}
}
class B extends A1{
	public static void Teacher() {
	System.out.println();
	System.out.println("Teacher");
	System.out.println("Department:Electronics");
	System.out.println("Subjects:DSP, MC,MP");
	System.out.println("Position:Asst.Prof");
}
}
class C extends A1{
	public static void Student() {
		System.out.println();
		System.out.println("Student");
		System.out.println("Athulya");
		System.out.println("BSc Electronics");
		System.out.println("2nd Year");
		System.out.println("3rd Sem");
	}
}