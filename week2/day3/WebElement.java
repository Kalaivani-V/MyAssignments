package week2.day3;

public class WebElement {

	public void click()
	{
		System.out.println("Click method in Web Element class");
	}
	public void setText(String text)
	{
		System.out.println(text +" setText method in Web Element class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebElement web =new WebElement();
     System.out.println("Inheritance - Super class Methods");
     web.setText("Hi");
     web.click();
     
	}

}
