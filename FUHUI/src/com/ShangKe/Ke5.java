package com.ShangKe;

import java.util.Scanner;

/**
 *" ."��Ϊ and���ԣ�һ�㲻�ܶ���private����ͨ�������������û��޸ģ���
 * ���η����� public   private    protect     static         final                    ��          ��
 *                    ������     ˽�е�       �ܱ�����     ��̬��    ˭Ҳ��׼��             û��
 *                   ��             ����Ȩ��                   ��                   0�޸ģ�������     ����=public
 *       static     ֱ�ӿ����õ� �� �Ѿ��еģ� ֱ�ӷ����ڴ���     
 *       import ���� ���iava�ļ���Ҫ�õ�����package���java�ļ���
 *       �����ͬһ��������赼��
 *       ����Ҫ���Զ�����    
 *       ().equals()    �ж��Ƿ���ͬ      
 *       ��ʶ��                                                 
 * 
 * ���췽����
 * 		����������ݽ��г�ʼ��
 * 
 * ��ʽ��
 * 		��������������ͬ
 * 		û�з���ֵ���ͣ���void������д
 * 		û�о���ķ���ֵ
 * 
 * ���췽����ע�����
 * 		A:�������û�и������췽����ϵͳ�����ṩһ��Ĭ�ϵ��޲ι��췽��������ʹ�á�
 * 		B:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽��������ʹ�á�
 *        ���ʱ�����������ʹ���޲ι��췽�����ͱ����Լ��ṩ��
 *        �Ƽ����Լ����޲ι��췽��
 *      C:���췽��Ҳ�ǿ������ص�
 * 
 * ��Ա������ֵ��
 * 		A:setXxx()����
 * 		B:���ι��췽��	
    ��ε��ù��췽����?
		//ͨ��new�ؼ��ֵ���
		//��ʽ������ ������ = new ���췽��(...);
		Student s = new Student();

 */
public class Ke5 {
public static void main(String[] args) {
	
		System.out.println("��ѡ��");
		System.err.println("1.ѧϰ");
		System.err.println("2.��ϰ");
		System.err.println("3.����");
		System.err.println("4.�˳�");
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();		
		switch (a) {
		case 1:
			System.out.println("��ӭ����ѧϰƽ̨��");
			System.out.println("��ѡ��ʽ��");
			System.out.println("1:��Ƶ��ѧ");
			System.out.println("2.ppt��ѧ");
			System.out.println("3.word��ѧ");
			Scanner sc =new Scanner(System.in);
			int c=sc.nextInt();	
			switch (c) {
			case 1:
				System.out.println("��Ƶ1");
				System.out.println("��Ƶ2");
				System.out.println("��Ƶ3");
				break ;
			case 2:
				System.out.println("ppt 1");
				System.out.println("ppt 2");
			case 3:
				System.out.println("word  1");
				System.out.println("word  2");
			}
			break;
		case 2:
			System.out.println("�¹ʶ�֪�£�����ΪʦҲ��");
			System.out.println("��ѡ���½ڣ�");
			System.out.println("��1��	����������");
			System.out.println("��2��	�����������֮��װ");
			System.out.println("��3��	�������֮���췽��");
			Scanner scc =new Scanner(System.in);
			int d=scc.nextInt();	
			switch (d) {
			case 1:
				System.out.println("1.1	�������˼��");
				System.out.println("1.2	��������ص�����������ص�");
				break;
			case 2:
				System.out.println("2.1	 ��װ��˽�йؼ���");
				System.out.println("2.2	this�ؼ���");
				break;
			case 3:
				System.out.println("3.1	���췽��:");
				break;
			}
			break;
		case 3:
			System.out.println("��׼��������");
			System.out.println("���Կ�ʼ��");
			break;
		case 4:
			System.out.println("ллʹ�ã�");
			break;
		}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}