package Encapsulation;

import java.util.Scanner;

public class example {
	public static void main(String arg[]) {
		Scanner S=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the name:");
		st.setName(S.next());
		System.out.println("enter the Id:");
		st.setId(S.next());
		System.out.println("name:"+st.getName());
		System.out.println("id:"+st.getId());
		
	}
}