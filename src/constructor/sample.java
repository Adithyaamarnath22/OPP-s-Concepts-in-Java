package constructor;

public class sample {
int a,b,c;

public sample(int i, int j) {
	// TODO Auto-generated constructor stub
	a=i;
	b=j;
	c=i+j;
}

//public static int add(int a,int b) {
//	return a+b;
//}

public static void main(String args[]) {
	sample obj=new sample(8,5);
//	int result= obj. add(6,7);
//	System.out.println(result);
	System.out.println(obj.a+" "+obj.b);
	System.out.println(obj.c);
}}
