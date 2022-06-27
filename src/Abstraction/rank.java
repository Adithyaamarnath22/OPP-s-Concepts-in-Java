package Abstraction;

public abstract class rank {

	abstract void totalmark(String name, int id);
	public void rank1()
	{
		System.out.println("Rank2");
	}

}
class student extends rank{

	@Override
	void totalmark(String name, int id) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+name);
	    System.out.println("id:"+id);
	    System.out.println("Total mark>445");
	}
	
}