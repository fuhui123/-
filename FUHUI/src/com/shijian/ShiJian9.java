package com.shijian;

public class ShiJian9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a =10;//实际参数，实际参与运算的变量
            int b =30;//实际参数，实际参与运算的变量
            System.out.println("a="+a+"b="+b);
            change(a,b);
            System.out.println("a="+a+"b="+b);
	}

	private static void change(int a, int b) {//形式参数，用于接受实际参数的变量
		// TODO Auto-generated method stub
		System.out.println("a="+a+"b="+b);
		a=b;//方法参数传递
		b=a+b;//方法参数传递
		System.out.println("a="+a+"b="+b);
	}

}
