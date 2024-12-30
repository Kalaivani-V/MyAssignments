package week3.day1;

public abstract class MySQLConnection implements DatabaseConnection2{
	abstract void executeQuery();//default AM is public
	//we cannot implement abstract method in abstract class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object creation throws error for Abstract class-not possible to create object.
	}

}
