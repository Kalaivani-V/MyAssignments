package JavaChallenge;

public class JavaChallenge2 {
	public int sqrt(int n)
	{		
		int res = 1;
	    while(res*res <= n){
	        res++;
	    }
		return res-1;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaChallenge2 jc =new JavaChallenge2();
		int x=12;
		int result=jc.sqrt(x);
		System.out.println("Square root of "+x+" is "+result);

	}

}
