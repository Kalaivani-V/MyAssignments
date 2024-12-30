package week3.day1;

//Implement keyword we need to use to implement interface in class
// extends keyword we need  to use implement interface in interface
public abstract class CanaraBank_AbstractClass implements PaymentsInterface{
	public void cashOnDelivery()
	{
		System.out.println("Cash on Delivery -Abstract class");
	}
	abstract void print();//Must to add one Abstract method in abstract class 
	
public static void main(String[] args) {
	//Object cannot be created for Abstract class and Interface class
	//0 to 100% implementation
	
	//to implement methods in interface and Abstract class we need execution class or concrete class
}
	

}
