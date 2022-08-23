package com.lamda;
interface LamdaExpressionPi
{
	double getPiValue();
}
public class Pi {

	public static void main(String[] args) {
		
		LamdaExpressionPi ref = ()-> 3.1415;
		System.out.println( ref.getPiValue());
	}

}
