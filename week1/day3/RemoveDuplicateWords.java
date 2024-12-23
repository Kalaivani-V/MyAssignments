package week1.day3;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="We learn Java Basics as part of java sessions in java week 1";
int count=0;
String[] strArray=text.split(" ");
int strLen =strArray.length;
System.out.println("Splited String Array  "+strLen);
System.out.println("Splited String Array  ");
for(int i=0;i<strLen;i++)
{
	
	System.out.println(strArray[i]);
	}
//String splitStr=strArray.toString();
//System.out.println("Original "+splitStr);
for(int i=0;i<strLen;i++)
{
	for(int j=i+1;j<strLen-1;j++)
	{
		if(strArray[i].equalsIgnoreCase(strArray[j]))
		{
			strArray[j]="";
			count++;
		}
	}
	
}
if(count>0)
	 System.out.println("Modified String");
 for(int k=0;k<strLen;k++)
 {
	 
	 System.out.println(strArray[k]);
 }
		
	}

}
