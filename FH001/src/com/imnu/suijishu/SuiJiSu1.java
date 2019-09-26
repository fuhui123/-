package com.imnu.suijishu;

import java.util.Random;
import java.util.Scanner;

public class SuiJiSu1 {
public static void main(String[] args) {
	 		Scanner sc = new Scanner(System.in);
	 		String count = new String ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	 		String a= fh(count);
	 		System.out.println("您的验证码为:" + a + "\n"+"请输入：");
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
	 			System.out.println("验证成功！");
	 			return;
	 		}else{
	 			for (int i = 0; i < 4; i++) {
	 				System.out.println("验证失败，还有：" + (4-i) + "次机会。");
	 				String d= fh(count);
	 				System.out.println("新的验证码为：" + d + "，请重新输入："); 
	 				String e = sc.nextLine();
	 				e.toLowerCase();
	 				if (d.equals(e)) {
	 					System.out.println("验证成功！");
	 					return;
	 				}else{
	 					
	 				}
	 			}
	 			System.out.println("您机会已经用完！系统自动退出!!!");
	 		}
	 	}
	 }
