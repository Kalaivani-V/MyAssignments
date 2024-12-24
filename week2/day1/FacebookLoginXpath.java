package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[contains(@name,'log')]")).click();
	
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.close();
	}

}
