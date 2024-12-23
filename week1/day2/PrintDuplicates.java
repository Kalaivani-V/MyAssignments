package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		int length = num.length;
		//Finding duplicate in a Nested for loop
		for (int i=0;i<length; i++)
		{
			for(int j=i+1;j<length-1;j++)
			{
				if(num[i]==num[j])
				{	
				System.out.println("Duplicate values are"+num[j]);
				}
			}
	}
		//Sorting the array
		Arrays.sort(num);
		for(int k=0;k<num.length;k++)
		{
			System.out.println("Sorted array"+num[k]);
		}
	//Finding Duplicate in a single for loop
		for(int j=0; j<num.length-1;j++)
		{
			if(num[j]==num[j+1])
			{
				System.out.println("Duplicate values are"+num[j]);
			}
		}
			
		
	}
}
