package com.liexi;

public class hh {
	/*
	 * String:�ַ�����
	 * 		�ɶ���ַ���ɵ�һ������
	 * 		�ַ����䱾����һ���ַ�����
	 * 
	 * ���췽����
	 * 		String(String original):���ַ������ݷ�װ���ַ�������
	 * 		String(char[] value):���ַ���������ݷ�װ���ַ�������
	 * 		String(char[] value, int index, int count):���ַ������е�һ�������ݷ�װ���ַ�������
	 * 
	 * ע�⣺�ַ�����һ�ֱȽ�����������������ͣ�ֱ������ַ�������������Ǹö����е����ݡ�
	 */
	public static void main(String[] args) {
		//��ʽ1
		//String(String original):���ַ������ݷ�װ���ַ�������
		String s1 = new String("hello");
		System.out.println("s1:"+s1);
		System.out.println("---------");
		
		//��ʽ2
		//String(char[] value):���ַ���������ݷ�װ���ַ�������
		char[] chs = {'h','e','l','l','o'};
		String s2 = new String(chs);
		System.out.println("s2:"+s2);
		System.out.println("---------");
		
		//��ʽ3
		//String(char[] value, int index, int count):���ַ������е�һ�������ݷ�װ���ַ�������
		//String s3 = new String(chs,0,chs.length);
		String s3 = new String(chs,1,3);//��һ��ʼ��ȡ��ȡ3����
		System.out.println("s3:"+s3);
		System.out.println("---------");
		
		//��ʽ4
		String s4 = "hello";
		System.out.println("s4:"+s4);

}}
