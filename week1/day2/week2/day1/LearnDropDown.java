package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		//ctrl+2-->local variable
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select s= new Select(element);
		s.selectByIndex(2);
		
		driver.close();
	}

}
