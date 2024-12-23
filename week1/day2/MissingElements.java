package week1.day2;

import java.util.Arrays;


public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,4,3,2,8,6,7};
Arrays.sort(a);

for(int j=1; j<a.length-1;j++)
{
	if(j!=a[j-1])
	{
		System.out.println("Missing elements are "+j);
	break;
	}
	}
}
}
