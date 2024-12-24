package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("abcd");
		driver.findElement(By.xpath("(//textarea[@name='description'])[1]")).sendKeys("Selenium Software Tester");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select s =new Select(element);
		s.selectByValue("IND_SOFTWARE");
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select s2 =new Select(element2);
		s2.selectByVisibleText("S-Corporation");
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select s3=new Select(element3);
		s3.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select s4=new Select(element4);
		s4.selectByIndex(5);
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s5=new Select(element5);
		s5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(8000);
		String title=driver.getTitle();
		System.out.println(title);
		//Thread.sleep(8000);
		driver.close();
	}

	
}
