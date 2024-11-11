package com.logical_and_operators;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int count=0;
		 if(num==1 || num==0) {
			 System.out.println("0 and 1 is not prime number, Enter another number to check");
		 }
		 else {
			 for(int i=1;i<=num;i++) {
				 if(num%i==0) {
					 count++;
				 }
			 }
			 if(count<=2) {
				 System.out.println("prime");
			 }
			 else {
				 System.out.println("not prime");
			 }
		  }

	}

}
