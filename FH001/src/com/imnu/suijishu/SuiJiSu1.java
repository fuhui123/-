package com.imnu.suijishu;

import java.util.Random;
import java.util.Scanner;

public class SuiJiSu1 {
public static void main(String[] args) {
	 		Scanner sc = new Scanner(System.in);
	 		String count = new String ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	 		String a= fh(count);
	 		System.out.println("������֤��Ϊ:" + a + "\n"+"�����룺");
	 		String b = sc.nextLine();
	 		b=b.toLowerCase();
	 		mun(count, a, b);
	 	}
	 	public static String fh(String count){
	 		Random arr= new Random();
	 		String a = "";
	 		for (int i = 0; i < 4; i++) {
	 			a=a+count.charAt(arr.nextInt(count.length()));
	 		}
	 		return a;
	 	}
	 	public static void mun(String count, String a, String b){
	 		Scanner sc = new Scanner(System.in);
	 		a=a.toLowerCase();
	 		if (a.equals(b)) {
	 			System.out.println("��֤�ɹ���");
	 			return;
	 		}else{
	 			for (int i = 0; i < 4; i++) {
	 				System.out.println("��֤ʧ�ܣ����У�" + (4-i) + "�λ��ᡣ");
	 				String d= fh(count);
	 				System.out.println("�µ���֤��Ϊ��" + d + "�����������룺"); 
	 				String e = sc.nextLine();
	 				e.toLowerCase();
	 				if (d.equals(e)) {
	 					System.out.println("��֤�ɹ���");
	 					return;
	 				}else{
	 					
	 				}
	 			}
	 			System.out.println("�������Ѿ����꣡ϵͳ�Զ��˳�!!!");
	 		}
	 	}
	 }
