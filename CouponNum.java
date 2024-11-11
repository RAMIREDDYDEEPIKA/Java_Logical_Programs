package com.logical_and_operators;

import java.util.HashSet;
import java.util.Scanner;
public class CouponNum {
	public static void main(String[] args) {
		 generate(3);
	}
	public static void generate(int n) {
		 HashSet<Integer> coupon=new HashSet<Integer>();
		 System.out.println("Enter coupons");
		 for(int i=1;i<=n;i++) {
			 Scanner sc=new Scanner(System.in);
			  int num=sc.nextInt();
			  coupon.add(num);
		 }
		  System.out.println("the distinct coupons are: "+coupon);
	}
}
