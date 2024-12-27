package week2.day3;

public class RadioButton extends Button{
	public void selectRadioButton()
	{
		System.out.println("select Radio button method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rad =new RadioButton();
		System.out.println("Hierarchy Inheritance");
		rad.submit();
		rad.selectRadioButton();
	}

}
