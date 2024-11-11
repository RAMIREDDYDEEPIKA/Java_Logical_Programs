package com.logical_and_operators;

public class PostPreIncrement {

	public static void main(String[] args) {
		 int num=2;
		 int preIncrement=++num; 
		 int postIncrement=num++;		  
		 int diff=preIncrement-postIncrement;
		 System.out.println("Pre increment of number is: "+preIncrement);
		 System.out.println("PostIncrement of number is: "+postIncrement);
		 System.out.println("Difference between pre and post increment is: "+diff);;

	}

}
