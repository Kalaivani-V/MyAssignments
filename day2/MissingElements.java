package week1.day2;

import java.util.Arrays;


public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,4,3,2,8,6,7};
Arrays.sort(a);
for(int i=1;i<=a.length-1;i++)
{
	
	if(i!=a[i-1])
	{
		System.out.println("Missing elements are"+i);
		//i=i-1;
		
	}
	
	}
	}
}
