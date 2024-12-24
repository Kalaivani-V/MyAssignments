package JavaChallenge;

import JavaChallenge.JavaChallenge1;

public class JavaChallenge1 {
public int lengthOfString(String last)
{
	int len= last.length();
	return len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaChallenge1 jc=new JavaChallenge1();
		String s="Hi this is Kalai";
		String[] str=s.split(" ");
		int length;
		length= jc.lengthOfString(str[str.length-1]);
		System.out.println(length);
	}

}
