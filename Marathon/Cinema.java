package Marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//select Location
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		//driver.findElement(By.className("cities-show")).click();
		driver.findElement(By.xpath("(//h6[text()='Chennai'])")).click();
		//select cinema
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		//select mall
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		//select date	
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//Thread.sleep(2000);
		//select movie
		driver.findElement(By.xpath("(//span[text()='THE SMILE MAN'])[2]")).click();
		//select time
		driver.findElement(By.xpath("//span[contains(text(),'04:05 PM')]")).click();
		//book the show
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		//accept terms
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//select seat
		driver.findElement(By.id("CL.CLUB|H:4")).click();
		driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
		//printing ticket summary
		String text= driver.findElement(By.xpath("//div[@class='select-seat-number']//p")).getText();
		System.out.println("Seat number: "+text);
		String text1=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Grand Total: "+text1);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String title=driver.getTitle();
		System.out.println("Title of the page :"+title);
		Thread.sleep(2000);
		driver.close();
	}

}
