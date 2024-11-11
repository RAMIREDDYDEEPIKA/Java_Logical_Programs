package com.logical_and_operators;

import java.util.Scanner;

public class ElapsedTime {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a start to count:" );
		 sc.nextLine();
		 long startTime=System.currentTimeMillis();
		 System.out.println("Enter a stop to count: ");
		 sc.nextLine();	  
		 long endTime=System.currentTimeMillis();
		 long elapsedTime=endTime-startTime;
		 System.out.println(startTime+" is starting time");
		 System.out.println(endTime+" is ending time");
		 System.out.println("ElapsedTime "+elapsedTime+" milliseconds");
		 double elapsedInseconds=elapsedTime/1000.0;
		 System.out.println("elapsed Time "+elapsedInseconds+" seconds");
		 
	}

}
