package com.shijian;

public class ShiJian9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a =10;//ʵ�ʲ�����ʵ�ʲ�������ı���
            int b =30;//ʵ�ʲ�����ʵ�ʲ�������ı���
            System.out.println("a="+a+"b="+b);
            change(a,b);
            System.out.println("a="+a+"b="+b);
	}

	private static void change(int a, int b) {//��ʽ���������ڽ���ʵ�ʲ����ı���
		// TODO Auto-generated method stub
		System.out.println("a="+a+"b="+b);
		a=b;//������������
		b=a+b;//������������
		System.out.println("a="+a+"b="+b);
	}

}
