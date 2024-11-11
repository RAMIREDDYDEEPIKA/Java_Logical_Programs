package com.logical_and_operators;

import java.util.Scanner;

public class DivBy5and7 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number to check whether it is divisible by 5 and 7");
		 int num=sc.nextInt();
		 if(num % 5 == 0 && num % 7 == 0) {
			 System.out.println(num+" is divisible by both 5 and 7");
		 }
		 else {
			 System.out.println("Not divisible by both 5 and 7");
		 }
	}

}
