package week2.day3;

public class CheckBoxButton extends Button{

	public void clickCheckButton()
	{
		System.out.println("clickCheckButton -Grand Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxButton chek =new CheckBoxButton();
		System.out.println("Multilevel Inheritance");
		chek.click();
		System.out.println("Hierarchy Inheritance");
		chek.submit();
		System.out.println("Calling from Checkbutton class");
		chek.clickCheckButton();
	}

}
