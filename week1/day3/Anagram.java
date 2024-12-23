package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1="stopa";
String text2="potss";
char[] strlen1=text1.toCharArray();
char[] strlen2=text2.toCharArray();
int count=0;
if(strlen1.length==strlen2.length) 
{
	Arrays.sort(strlen1);
	Arrays.sort(strlen2);
	
	for(int i=0;i<strlen1.length;i++)
	{
		if(strlen1[i]==strlen2[i])
		{
		count++;
		}
		else
		{
			break;
		}
	}
	if(count==strlen1.length)
	{
		System.out.println("The given Strings are Anagram");
	}

	else
	{
		System.out.println("The given Strings are not Anagram ");
	}
}
else
	{
		System.out.println("The given Strings are not Anagram ");
	}
}
}


