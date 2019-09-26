package com.shijian;

import java.util.Random;
import java.util.Scanner;

public class ShiJian7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		while (true) {

			Scanner s = new Scanner(System.in);
			System.out.println("请输入你猜到的数：0-100");
			int a = s.nextInt();
			count++;
			if (a > number) {
				System.out.println("太大了");

			} else if (a < number) {
				System.out.println("太小了");
			} else {
				System.out.println("恭喜你，猜对了！");
				break;
			}
			if (count > 3) {
				System.out.println("猜数结束！");
				break;
			}
		}
	}

}
