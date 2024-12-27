package week2.day3;

public class MethodOverloadingStaticPolymorphism {
	public void reportStep(String msg, String status)
	{
		System.out.println("report Step with two arg");
	}

	public void reportStep(String msg, String status,boolean snap)
	{
		System.out.println("report Step with threereport arg");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingStaticPolymorphism m =new MethodOverloadingStaticPolymorphism();
		System.out.println("Method Overloading/Static/Compile time/Early binding polymorphism");
		// Same function name with different no of arguments /differnt type of arguments with same access modifier and same return type
		m.reportStep("hi", "ok");
		m.reportStep("hello","yeah",true);
		
	}

}
