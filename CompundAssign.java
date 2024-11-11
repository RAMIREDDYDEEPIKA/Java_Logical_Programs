package com.logical_and_operators;

import java.util.Scanner;

public class CompundAssign {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 System.out.println(num*=num);//2=2*2=4
		 System.out.println(num%=3);	//4=4%3=1	  
		 System.out.println(num+=num);//1=1+1=2
		 System.out.println(num/=3);//2=2/3=0.6
		 System.out.println(num-=num);//0=0-0
		  
	}

}
