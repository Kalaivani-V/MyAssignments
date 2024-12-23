package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver setup
ChromeDriver driver=new ChromeDriver();
//EdgeDriver driver1 =new EdgeDriver();
//FirefoxDriver driver2=new FirefoxDriver();

//load the URL
driver.get("http://leaftaps.com/opentaps/control/main");
//driver1.get("http://leaftaps.com/opentaps/control/main");
//driver2.get("http://leaftaps.com/opentaps/control/main");

//To maximize the screen
driver.manage().window().maximize();

//java wait
//Thread.sleep(3000);

//close browser
driver.close();
	}

}
