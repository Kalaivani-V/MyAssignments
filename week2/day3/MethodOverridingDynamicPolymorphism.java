package week2.day3;

public class MethodOverridingDynamicPolymorphism extends EdgeBrowser{
	public void takeSnap()
	{
	System.out.println("Taken snap with advanced features");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingDynamicPolymorphism s = new MethodOverridingDynamicPolymorphism();
		System.out.println("Method Overriding/Dynamic/Runtime/LateBind Polymorphism");
		s.takeSnap();
		
		//real time example-quit();
	}

}
