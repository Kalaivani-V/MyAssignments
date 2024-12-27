package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Axes Xpath is Advanced Xpath
		//Implicit wait is common for entire lines of code
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Grand parent -child
		driver.findElement(By.xpath("(//div[contains(@id,'username_container')]//input)")).sendKeys("dilip@testleaf.com");
		//Elder sibling-younger sibling
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("leaf@2024");
		//Elder sibling-younger sibling
		driver.findElement(By.xpath("//div[@id='pwcaps']/following-sibling::input")).click();
		
		Thread.sleep(30);
		driver.close();
	}

}
