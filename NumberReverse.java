package com.logical_and_operators;

public class NumberReverse {

	public static void main(String[] args) {
		 int num=123;
		 int remainder,result=0 ;
		  while(num!=0) {
			 remainder=num%10;
			 result=result*10+remainder;
			 num=num/10;
		 }
		  System.out.println("The reverse of a number is: "+result);

	}

}
