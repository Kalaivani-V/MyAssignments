package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFacebook {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	
	//Find a tag
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	int size = elements.size();
	System.out.println("Size of a tag:"+size);
	
	for(int i=0;i<size;i++)
	{
		System.out.println("Text of a tag:"+elements.get(i).getText());
	}
	
	//Sorting the text
	//Collections.sort(elements);
}
}
