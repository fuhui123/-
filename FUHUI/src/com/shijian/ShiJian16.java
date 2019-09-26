package com.shijian;

import java.util.Scanner;

public class ShiJian16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第一个数据： ");
	int a =  sc .nextInt();
	System.err.println("请输入第二个数据： ");
	int b =sc.nextInt();
	System.err.println("请输入第三个数据： ");
	int d=sc.nextInt();
	int r =sum(a,b,d);//方法调用；
	System.out.println("r="+r);
}
public static int sum(int a,int b,int d){
	int c =a+b-d;
	return c; 
	
}
}
