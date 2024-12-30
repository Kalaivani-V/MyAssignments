package week3.day1;

public interface PaymentsInterface {
		//default and static we need to implement in Interface 
		//static and default available from Java 1.8
	 
	 public void cashOnDelivery();//this needs to be implemented compulsorily in abstract class if we use lesser java versions less than 1.8 
	 default void upiPayments()
	 {
		 System.out.println("upi payments--default");
	 }
	 public void cardPayments();
	 public void internetBanking();
	 static void bill()
	 {
		 System.out.println("bill method--Static");
	 }
	 
}
