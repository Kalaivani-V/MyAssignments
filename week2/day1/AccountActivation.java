package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountActivation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://www.telerik.com/contact
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.telerik.com/contact");
		driver.manage().window().maximize();
		//Here id attribute we cannot use because it have number---"Dropdown-1"..so we use name
		//WebElement element = driver.findElement(By.id("Dropdown-1"));
		WebElement element = driver.findElement(By.name("DropdownListFieldController_0"));
		
		Select object1=new Select(element);
		object1.selectByVisibleText("Account activation");
		
		//WebElement element2 = driver.findElement(By.id("Dropdown-2"));
		WebElement element2 = driver.findElement(By.name("DropdownListFieldController"));
		Select object2=new Select(element2);
		object2.selectByValue("UI for WinForms");
		
		//WebElement element3 = driver.findElement(By.id("Country-1"));
		WebElement element3 = driver.findElement(By.name("DynamicListFieldController"));
		Select object3=new Select(element3);
		object3.selectByIndex(100);
		
		Thread.sleep(3000);
		driver.close();
	}

}
