package JavaChallenge;

public class JavaChallenge3 {
	public String IsPalindrome(String s)
	{
		
		String lc=s.toLowerCase();
	
		String replaceAllString =lc.replaceAll("[^A-za-z0-9]","");
		System.out.println("Replaced String is: "+replaceAllString);
		int len = replaceAllString.length();
		char[] arr=replaceAllString.toCharArray();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		if(replaceAllString.equals(rev))
		{
			System.out.println("Given string is a Palindrome");
		}else
		{
			System.out.println("Given string is not a Palindrome");
		}
		System.out.println("Output String is: "+rev);
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaChallenge3 obj =new JavaChallenge3();
		
		obj.IsPalindrome("A man,a plan,a canal:Panama");
		obj.IsPalindrome("race a car");
		obj.IsPalindrome("");
	
		
	}

}
