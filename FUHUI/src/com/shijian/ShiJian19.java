package com.shijian;
/**
 * ��һ�����ӣ��ӳ��������������ÿһ���¶���һ�����ӣ�С���ӳ�����
 * �����º�ÿһ���¶���һ�����ӡ�
 * �ʣ��������Ӷ���������20���µ����Ӷ����ж��٣�
 * */
public class ShiJian19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					int arr [] = new int [20];
					         arr [0]=1;
					         arr[1] =1;
					 for (int i = 2; i < arr.length; i++) {
					         arr[i] =arr[i-1]+arr[i-2];
					 }
					 System.out.println(arr[19]);
	}

}
