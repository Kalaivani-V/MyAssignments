package week1.day3;

public class LearnStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Test leaf";
		String comName=new String("Test leaf");
		
		//String Length
		int stringLength=name.length();
		System.out.println("Length of the string"+stringLength);
		
		//contains ---Case sensitive
		boolean contains=name.contains(comName);
		System.out.println("Contains methods:" +contains);
		
		//charAt
		//Index value starts from '0'
		char charAt=name.charAt(7);
		System.out.println("Char At  "+charAt);
		
		//equals --case sensitive
		String text_1="ace";
		String text_2="Ace";
		if(text_1.equals(text_2))
		{
			System.out.println("Data is equal");
		}
		else
		{
			System.out.println("Data is not equal");
		}
		
		// == and equals
		// == -> check memory address of the String value
		// .equals() --->check string content
		
		if(text_1==text_2)
		{
			System.out.println("Data is equal");
		}else
		{
			System.out.println("Data is equal===");
		}
		//.equalsIgnoreCase
		if(text_1.equalsIgnoreCase(text_2))
		{
			System.out.println("Data is equal");
		}
		else
		{
			System.out.println("Data is not Equal");
		}
		
		//toCharArray
		String text="Selenium";
		char[]textArray=text.toCharArray();
		//printing char array
		for(int i=0;i<textArray.length;i++)
		{
			System.out.println(textArray[i]);
		}
		//printing reverse array
		for(int i=textArray.length-1;i>=0;--i)
		{
		System.out.println(textArray[i]);	
		}
	}

}
