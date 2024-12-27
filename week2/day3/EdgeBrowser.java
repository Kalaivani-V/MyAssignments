package week2.day3;

public class EdgeBrowser extends Browser{
	//takeSnap() and clearCookies(
	public void takeSnap()
	{
	System.out.println("takeSnap");
	}
	public void clearCookies()
	{
	System.out.println("clearCookies");
	closeBrowser();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeBrowser e=new EdgeBrowser();
		System.out.println(e.browserName+" is :"+"Edge browser");
		System.out.println("Hierarchial Inheritance from Parent to multiple child");
		e.takeSnap();
		e.clearCookies();
		System.out.println("Hybrid Inheritance from parent to child");
		e.closeBrowser();
		
		//Hierarchial Inheritance
	}

}
