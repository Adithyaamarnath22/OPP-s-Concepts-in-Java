package Prgm;

public class Vehicles {
	public static void main(String args[]) {
		Bus obj=new Bus();
		obj.Vehicle();
		obj.car();
		obj.bus();
	}

}

class vehicle{
	public static void Vehicle() {
		System.out.println("VEHICLE");
		System.out.println("A vehicle is a machine to move people and things");
	}
}
class Car extends vehicle{
	public static void car() {
		System.out.println("CAR");
		System.out.println("Car is a wheeled motor vehicle");
		System.out.println("it used for transporting passengers ");
	}
}

class Bus extends Car{
	public static void bus() {
		System.out.println("BUS");
		System.out.println("Bus is a large road vehicle for transporting peoples");
	}
}