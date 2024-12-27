package week2.day3;

public class SafariBrowser extends ChromeBrowser {

	public void readerMode()
	{
	System.out.println("readerMode()");
	}
	public void fullScreenMode()
	{
	System.out.println("fullScreenMode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafariBrowser s=new SafariBrowser();
		System.out.println(s.browserName+" is :"+"Safari browser");
		System.out.println("Hybrid Inheritance from super parent to child");
		s.closeBrowser();//Hybrid Inheritance
		System.out.println("Multilevel Inheritance from super parent to parent to child");
		s.clearCache();//Multilevel Inheritance
		s.readerMode();
		s.fullScreenMode();
	}

}
