package week1.day3;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a Software Tester";
		String[] testArray = test.split(" ");
		int length = testArray.length;
		String oddWord;
		char[] oddWordArray;
		for (int i = 0; i < length; i++) {
			if (i % 2 != 0) {
				oddWord = testArray[i];
				oddWordArray = oddWord.toCharArray();
				for (int j = oddWordArray.length - 1; j >= 0; j--) 
				{
					System.out.println(oddWordArray[j]);
				}
			} else
				System.out.println(testArray[i]);
		}
	}
}
