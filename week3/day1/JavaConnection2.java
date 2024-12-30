package week3.day1;

public class JavaConnection2 extends MySQLConnection{
/*Concrete or execution class provides Implementation for Abstract methods 
	declared in Interface and Abstract class */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection2 jc =new JavaConnection2();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
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
	
	void executeQuery() {
		System.out.println("ExecuteQuery Abstract class method");
	}

}
