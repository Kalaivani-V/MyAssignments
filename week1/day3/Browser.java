package week1.day3;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser Launched Successfully: "+browserName);
		return browserName;
	}
	public void loadUrl(String url)
	{
		System.out.println("Application url loaded Successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser b=new Browser();
	b.loadUrl("https://www.google.com");
	b.launchBrowser("Chrome");
	}

}
