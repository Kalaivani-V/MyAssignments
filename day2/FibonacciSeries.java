package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {0,1,2,3,5,8,13,21}; 
for(int i=0; i<a.length;i++)
{if(i==0 || i==1)
{
	System.out.println(a[i]);}
if(i>=2) {
	a[i]=a[i-1]+a[i-2];
	System.out.println(a[i]);}
}
	}

}

