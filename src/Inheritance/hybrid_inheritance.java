package Inheritance;

public class hybrid_inheritance {
	
	  public static void main(String args[]){

			classD obj = new classD();
			obj.disp();
			obj.disply();
			
		   }
		}
	class classC
	{
	   public static void disply()
	   {
		System.out.println("C");
	   }
	}

	class classD extends classC
	{
	   public static void disp()
	   {
		System.out.println("A");
	   }
	}

	class classE extends classC
	{
	   public void dis()
	   {
		System.out.println("B");
	   }
	}

	class classF extends classD
	{
	   public static void displys()
	   {
		System.out.println("D");
	   }
	   }
	

