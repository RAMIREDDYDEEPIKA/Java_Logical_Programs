package com.logical_and_operators;

import java.util.Scanner;
public class AddSub {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter two numbers to perform addition and subtraction:");
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 int sum=n1+n2;
		 int difference=n1-n2;
		 System.out.println("The sum of two numbers are: "+sum);
		 System.out.println("The difference of two numbers are: "+difference);
		 

	}

}
