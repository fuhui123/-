package com.imnu.suijishu;

import java.util.Scanner;

public class SuiJiShu {
	public static void main(String[] args) {

		int english = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������һ���ַ���");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {//�ж��Ƿ�Ϊ��ĸ��
				english++;
			}
		}
		System.out.println("��ĸ�ĸ�����" + english);
		
	}
}
