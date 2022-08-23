
public class Main {

	void subStr(String s1) {
		int len=s1.length();
		if(s1.substring(0,2).equals(s1.substring(len-2,len)))
		{
			System.out.println(s1.substring(2,len));
			
		}
		else
			System.out.println(s1);
	}

	public static void main(String[] args) {
		Main str=new Main();
		String s1="redyellowred";
		str.subStr(s1);
	}
}
