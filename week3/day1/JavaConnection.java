package week3.day1;

public class JavaConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc =new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}
	//Abstract method Implementation in concrete class
	public void connect() {
		System.out.println("Connect method");
		
	}

	public void disconnect() {
		System.out.println("Disconnect method");
		
	}
	
	public void executeUpdate() {
		System.out.println("Execute Update method");

	}

}
