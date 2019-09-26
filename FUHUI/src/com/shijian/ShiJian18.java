package com.shijian;
/**
 * 打印五位数中所有回文数。
 * 什么是回文数：
 * 12321
 * 各位与万位相同，十位与千位相同。
 * */
public class ShiJian18 {
public static void main(String[] args) {
	for (int i = 100000; i < 100000; i++) {
		int ge =i%10;
		int shi =i/10%10;
		int qian =i/10/1010%10;
		int wan =i/10/10/10/10%10;
		if (ge==wan&&qian==shi) {
			System.out.println("回文数有:"+i);
		}
	}
	
}
}
