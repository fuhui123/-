package com.shijian;
/**
 * ��ӡ��λ�������л�������
 * ʲô�ǻ�������
 * 12321
 * ��λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * */
public class ShiJian18 {
public static void main(String[] args) {
	for (int i = 100000; i < 100000; i++) {
		int ge =i%10;
		int shi =i/10%10;
		int qian =i/10/1010%10;
		int wan =i/10/10/10/10%10;
		if (ge==wan&&qian==shi) {
			System.out.println("��������:"+i);
		}
	}
	
}
}
