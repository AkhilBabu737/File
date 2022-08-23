
public class Compare {

	public static void main(String[] args) {
		String str1="my name is akhil";
		String str2="my favourite sport is football";
		System.out.println(str1);
		System.out.println(str2);
		if(str1.compareTo(str2)>0)
			System.out.println("str1 comes after str2");
		if(str1.compareTo(str2)<0)
			System.out.println("str1 comes before str2");
		if(str1.compareTo(str2)==0)
			System.out.println("str1 is equal to str2");
	}
}
