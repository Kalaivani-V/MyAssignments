package week2.day3;


public class ApiClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint +" service is requested");
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println(endpoint +"service returned a response ok");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApiClient obj = new ApiClient();
		System.out.println("Method overloading");
		obj.sendRequest("/authors");
		obj.sendRequest("/authors","{request}",true);
		
	}

}
