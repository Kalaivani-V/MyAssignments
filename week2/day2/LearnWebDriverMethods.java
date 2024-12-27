package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Str=driver.getTitle();
		System.out.println("Title of the page : "+Str);
		
		driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		//sendKeys("",Keys.ENTER);
		
		String bookname= driver.findElement(By.xpath("//h2[contains(@class,'a-size-medium')]/span")).getText();
	    System.out.println("Book name is "+bookname);
	  
	    String Price=driver.findElement(By.xpath("//span[contains(@class,'a-price-symbol')]/following-sibling::span")).getText();
	    System.out.println("Price of the book:"+Price);
	    
	    //removing , from price
	    String replacedPrice=Price.replaceAll(",", "");
	    //String value to Integer value
	    int parseInt=Integer.parseInt(replacedPrice);
	    System.out.println("Price of the book:"+parseInt);
	   
	    //To get the current URL of the page
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("Current URL is "+currentUrl);
	    
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}
