package Prgm;

public class booking_details {
int Price;
int TotalPrice;
int Number;
String Detail;
String Name;
String Gender;
int Age;
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	this.Price = price;
}
public int getTotalPrice() {
	return TotalPrice;
}
public void setTotalPrice(int totalprice) {
	this.TotalPrice=totalprice;
}
public int getNumber() {
	return Number;
}
public void setNumber(int number) {
	Number = number;
}
public String getDetail() {
	return Detail;
}
public void setDetail(String detail) {
	Detail = detail;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}

	public void show() {
		int n=getNumber();
		System.out.println("NO OF PASSENGERS :"+n);
		int p=getPrice();
		System.out.println("PRICE OF TICKET :"+p);
		int t=getTotalPrice();
		t=(n*p);
		System.out.println("TOTAL AMOUNT :"+t);
	}
	
	
	
	
}
