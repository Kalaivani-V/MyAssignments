package week2.day3;

public class Browser{
//GrandParent Class or Super class or Base class
	String browserName="Name of the Browser";
	float browserVersion=4.6f;
	public void openURL() {
	
	System.out.println("Open the URL");	
	}
	public void closeBrowser()
	{
		System.out.println("Close the browser");	
	}
	public void navigateBack()
	{
		System.out.println("Navigate back to home");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		System.out.println(b.browserName+" is :"+"browser");
		System.out.println("I am Super/Grand Parent class");
		System.out.println(b.browserVersion +" is the Browser Version");
		b.openURL();
		b.closeBrowser();
		b.navigateBack();
	}



}
