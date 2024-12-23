package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName ="Test Leaf";
		//Convert String to charArray
		char[] comName=companyName.toCharArray();
		
			for(int j=comName.length-1;j>=0;j--)
			{
				System.out.println(comName[j]);
			}
	}

}
