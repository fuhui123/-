package com.imnu.yichang;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
			try {
				double S;
				System.out.println("������Բ�εİ뾶��");
				Scanner sc = new Scanner(System.in);
				double r = sc.nextDouble();
				S = r * r * 3.1415;
				System.out.println("Բ�ε�����ǣ�" + S);
			} catch (Exception r) {
				System.out.println("��������Ƿ����֣����������룡");

			/*
				 * finally { System.out.println("������Բ�εİ뾶��"); Scanner sc=new
				 * Scanner(System.in); double r=sc.nextDouble(); m=r*r*3.1415;
				 * System.out.println("Բ�ε�����ǣ�"+m);
				 * 
				 * }
				 */
		}
	}

}
