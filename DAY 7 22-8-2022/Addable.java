package com.lamda;

interface LamdaExpressons
{
	int add(int a,int b);

}
public class Addable {

	public static void main(String[] args) {
		
		LamdaExpressons ad1 = (a,b)->(a+b);
		System.out.println(ad1.add(12,15));
		
		LamdaExpressons ad2 = (a,b)->
		{
			return(a+b);
		};

			System.out.println(ad2.add(14,16));
	
	}

}
