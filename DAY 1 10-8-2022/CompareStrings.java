
public class CompareStrings {

	public CompareStrings(String str1,String str2)
	{
		if(str1==str2)
		{
			System.out.println("Both the strings contains same data");
		}
		else
		{
			System.out.println("Both the strings contains different data");
		}
	}
		

	public static void main(String[] args) {
		String str1="apple";
		String str2="applecakes";
		CompareStrings str=new CompareStrings(str1, str2);
		str.compareStrings(str1,str2);
	}


	private void compareStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		
	}

}
