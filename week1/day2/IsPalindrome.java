package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To check whether the given number is Palindrome or not
		
		int num=12321;
		
		int rem,sum=0;
		for(int i=num;i>0;i=i/10)
		{
			rem=i%10;
			sum=(sum*10)+rem;
		}
		if(num==sum)
			System.out.println("The given number is Palindrome "+num);
		else
			System.out.println("The given number is not palindrome "+num);
	}

}
