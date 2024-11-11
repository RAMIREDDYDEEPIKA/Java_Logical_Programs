package com.logical_and_operators;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter 5 nuumbers: ");
		 int number1=sc.nextInt();
		 int number2=sc.nextInt();
		 int number3=sc.nextInt();
		 int number4=sc.nextInt();
		 int number5=sc.nextInt();
		 int avg=(n1+n2+n3+n4+n5)/5;
		 System.out.println("The Average of 5 numbers are: "+avg);


	}

}
