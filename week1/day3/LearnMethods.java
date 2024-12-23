package week1.day3;

public class LearnMethods {

	public int browserCount(int num)
	{
		int k=num;
		return k;
	}
	private void startApp(String browserName, String url)
	{
		System.out.println(browserName +url);
	}
	void locateElement(String value)
	{
		System.out.println("Default Access Modifier");
	}
	protected void name()
	{
		System.out.println("Protected Access  Modifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnMethods lm= new LearnMethods();
		lm.name();
		int i= lm.browserCount(5);
		System.out.println("i"+i);
		lm.locateElement("cat");
		lm.startApp("chrome", "www.chrome.com");
	}

}
