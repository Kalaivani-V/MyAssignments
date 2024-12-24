package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kalai");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vani");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcdefg@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abc@123");
		WebElement element = driver.findElement(By.id("day"));
		Select s=new Select(element);
		s.selectByIndex(7);
		
		WebElement element2 = driver.findElement(By.name("birthday_month"));
		Select s1=new Select(element2);
		s1.selectByVisibleText("Mar");
		
		WebElement element3 = driver.findElement(By.id("year"));
		Select s3=new Select(element3);
		s3.selectByIndex(2);   
	
		driver.findElement(By.xpath("//input[@class='_8esa'][1]")).click();
		//Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.close();
	}

}
