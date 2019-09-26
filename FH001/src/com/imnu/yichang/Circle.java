package com.imnu.yichang;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
			try {
				double S;
				System.out.println("请输入圆形的半径：");
				Scanner sc = new Scanner(System.in);
				double r = sc.nextDouble();
				S = r * r * 3.1415;
				System.out.println("圆形的面积是：" + S);
			} catch (Exception r) {
				System.out.println("您输入的是非数字！请重新输入！");

			/*
				 * finally { System.out.println("请输入圆形的半径："); Scanner sc=new
				 * Scanner(System.in); double r=sc.nextDouble(); m=r*r*3.1415;
				 * System.out.println("圆形的面积是："+m);
				 * 
				 * }
				 */
		}
	}

}
