package week1.day2;

public class FindEvenNumbers {
	public static void main(String[] args) {
		int maxRange = 10;
		System.out.println("The Even numbers are:");
		for (int i = 0; i <= maxRange; i++) {
			if (i % 2 != 1) //i%2==0
			{
				System.out.println(i);
			}

		}
	}

}
