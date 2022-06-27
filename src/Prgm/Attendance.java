package Prgm;

import class_object.students;

public class Attendance {
public static void main(String args[]) {
	students S=new students();
	
}
}

class teacher{
	public void attendence() {
		System.out.println("Today attendences");
	}
}

class children extends teacher{
	public void attendance(){
		System.out.println("50% students have fullday attendence");
		System.out.println("50% students have only halfday attendence");
	
	super.attendence();
}
}