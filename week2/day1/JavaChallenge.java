package week2.day1;

public class JavaChallenge {
public int lengthOfString(String last)
{
	int len= last.length();
	return len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaChallenge jc=new JavaChallenge();
		String s="Hi this is Kalai";
		String[] str=s.split(" ");
		int length;
		length= jc.lengthOfString(str[str.length-1]);
		System.out.println(length);
	}

}
