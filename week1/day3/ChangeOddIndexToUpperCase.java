package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="changeme";
		char[] textChar=text.toCharArray();
		System.out.println("Modified String is  ");
		for(int i=0;i<textChar.length;i++)
		{
			if(i%2==0)
			{
				//Changing character to upper case
				textChar[i]=Character.toUpperCase(textChar[i]);
			}
			System.out.println(textChar[i]);
		}
		//Converting Char Array to String
		String modifiedText=new String(textChar);
		System.out.println("Modified String is..  "+modifiedText);
	}

}
