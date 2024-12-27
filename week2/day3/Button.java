package week2.day3;

public class Button extends WebElement {
	public void submit()
	{
		
		System.out.println("Submit method in Button class");
		click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button b = new Button();
		System.out.println("Single/Simple Inheritance");
		b.click();
		b.submit();
		
		
	}

}
