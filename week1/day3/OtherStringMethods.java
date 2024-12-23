package week1.day3;

public class OtherStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="Select Class";
		//To Lower case
		String lc=data.toLowerCase();
		System.out.println("Lower case data: "+lc);
		
		//To Upper case
		String uc=lc.toUpperCase();
		System.out.println("Upper case data:"+uc);
		
		//replace
		String ai="Gen Ai";
		String replaceString=ai.replace('e','E');
		System.out.println(replaceString);
		String replaceString1=ai.replace('n','g');
		System.out.println(replaceString1);
		
		//replace All
		String val="Kalaivani#10Sep1992";
		String replaceAll=val.replaceAll("[^A-Za-z]", "Pad");
		System.out.println(replaceAll);
		
		//split
		String value="Welcome to Test Leaf";
		
		String[] split=value.split("e");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		String replaceAll1=value.replaceAll(" ", "");
		System.out.println(replaceAll1);
	}

}
