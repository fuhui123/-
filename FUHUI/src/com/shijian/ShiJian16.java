package com.shijian;

import java.util.Scanner;

public class ShiJian16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ�����ݣ� ");
	int a =  sc .nextInt();
	System.err.println("������ڶ������ݣ� ");
	int b =sc.nextInt();
	System.err.println("��������������ݣ� ");
	int d=sc.nextInt();
	int r =sum(a,b,d);//�������ã�
	System.out.println("r="+r);
}
public static int sum(int a,int b,int d){
	int c =a+b-d;
	return c; 
	
}
}
