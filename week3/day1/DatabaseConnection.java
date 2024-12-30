package week3.day1;

public interface DatabaseConnection {
	/*no need to mention access modifier- by default every methods inside
	 interface is public */
	
	void connect();//method implementation not allowed here
	void disconnect();
	void executeUpdate();
}
//In interface - object creation not allowed