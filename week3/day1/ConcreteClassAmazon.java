package week3.day1;

public class ConcreteClassAmazon extends CanaraBank_AbstractClass{
	

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Print menthod---Abstract method in Concrete class");
	}
	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Card Payments method in Concrete class");
	}
	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet Banking method in Execution class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100% implementation required
		ConcreteClassAmazon c = new ConcreteClassAmazon();
		c.cardPayments();
		c.cashOnDelivery();
		c.upiPayments();
		c.internetBanking();
		c.print();
		//static method cannot be called using object 
		PaymentsInterface.bill();//Static method can be called by using Interface name
	}
}
