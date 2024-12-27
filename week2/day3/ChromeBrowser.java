package week2.day3;

public class ChromeBrowser extends Browser{
	public void openIncognito()
	{
	System.out.println("openIncognito");
	}
	public void clearCache()
	{
	System.out.println("clearCache");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeBrowser c=new ChromeBrowser();
		System.out.println(c.browserName+" is :"+"Chrome browser");
		System.out.println("Single Inheritance from Parent to child");
		c.openIncognito();
		c.clearCache();
		c.closeBrowser();//Single Inheritance from Parent to child
	}

}
