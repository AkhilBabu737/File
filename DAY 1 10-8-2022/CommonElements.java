
public class CommonElements {

	public static void main(String[] args) {
		int arr1[]= {1,3,5,6,8,9,10};
		int arr2[]= {1,0,6,4,8,15,9};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j]) 
				{
					System.out.println("CommonElement is:"+(arr1[i]));
				}
			}
		}
	}

}
