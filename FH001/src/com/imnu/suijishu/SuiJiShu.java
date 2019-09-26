package com.imnu.suijishu;

import java.util.Scanner;

public class SuiJiShu {
	public static void main(String[] args) {

		int english = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一行字符：");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {//判断是否为字母！
				english++;
			}
		}
		System.out.println("字母的个数：" + english);
		
	}
}
