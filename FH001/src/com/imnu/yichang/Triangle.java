package com.imnu.yichang;
import java.util.Scanner;
public class Triangle {


	/**
	 * 
	 * ����Triangle�����ڱ�ʾ�����Σ������������ߵĺͱ�����ڵ������ߡ�����IllegalTriangleException��������Υ�����Ϲ�������룬����������쳣�ࡣ��ʾ��Triangle��Ĺ��췽��
	 * ���£�
	 * 	public triangle(double side1, double side2, double side3)throws lllegaltriangleException{}
	 *
	 */
	
		//�ȳ�ʼ��һ���������Ը��������쳣
		static String[] biaoshis = new String[]{"no"};
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//�����쳣����
			new IllegalArgumentException();
			int side1 = 0;
			int side2 = 0;
			int side3 = 0;
			//��������ƥ���쳣
			try {
				//����¼������
				System.out.println("�������һ���ߵı߳���");
				side1 = sc.nextInt();
				System.out.println("������ڶ����ߵı߳���");
				side2 = sc.nextInt();
				System.out.println("������������ߵı߳���");
				side3 = sc.nextInt();
				//���������β��Ϸ����쳣
				try {
					//���÷����ж������Ƿ�Ϸ�
					test(triangle(side1, side2, side3));
				} catch (IllegalTringleException e1) {
					e1.printStackTrace();
				} catch (Exception e2){
					System.out.println("�������β�������");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("�����������֣�����");
			}
			try {
				if (triangle(side1, side2, side3).equals("yes")) {
					System.out.println("�������γ�����");
				}
			} catch (IllegalTringleException e) {
				// TODO Auto-generated catch block
			}
		}

		//�ж��������Ƿ�Ϸ�
		public static String triangle(int side1, int side2, int side3)throws IllegalTringleException{
			if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
				return "yes";
			}else{
				return "no";
			}
		}
		
		//�������������β��Ϸ����쳣
		public static void test(String biaoshi) throws IllegalTringleException{
			for (String bs : biaoshis){
				if (bs.equals(biaoshi)) {
					throw new IllegalTringleException("�������β�������");
				}
			}
		}
	}

	//�Զ����쳣����IllegalTringleException
	class IllegalTringleException extends Exception {
		static final long serialVersionUID = 94551659454L;
		public IllegalTringleException(){
			super();
		}
		public IllegalTringleException(String message, Throwable cause){
			super(message, cause);
		}
		public IllegalTringleException(String message){
			super(message);
		}
	}



	


	