package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//search bag
		driver.findElement(By.id(("twotabsearchtextbox"))).sendKeys("Bags for Boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//open any bag from the result
		driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']/span)[5]")).click();
		String result=driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span")).getText();
		System.out.println("Total number of search results is: "+result);
		//checking brands
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		//driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();

		//selecting New Arrivals
		driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
		
	
		//driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		//driver.findElement(By.xpath("(//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a)[5]")).click();
		
		//Open the first bag from the result
		driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']")).click();
		
		//Printing bag title and price
		String bagTitle = driver.findElement(By.xpath("//h2[@class=\"a-size-base-plus a-spacing-none a-color-base a-text-normal\"]")).getText();
		System.out.println("Title of the bag"+bagTitle);
		String disPrice = driver.findElement(By.xpath("//span[@class=\"a-price-whole\"]")).getText();
		
		System.out.println("Name of the bag: "+bagTitle+" Discounted Price: "+disPrice);
		//printing title of the page
		String title2=driver.getTitle();
		System.out.println("Title of the page: "+title2);
		
		Thread.sleep(2000);
		driver.close();
	}

}
