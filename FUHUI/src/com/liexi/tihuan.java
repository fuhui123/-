package com.liexi;

import java.util.Arrays;

public class tihuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] =new int[]{45 , 12, 2, 77, 31, 91, 10};//���岢����int������arr
           Arrays.fill(arr, 1, 4, 8);//ʹ��fill()����������������
           for (int i = 0; i < arr.length; i++) {//ѭ�����������е�Ԫ��
        	   //�������е�ÿһ��Ԫ�����
        	   System.out.println("��"+ i + "��Ԫ���ǣ�" +arr[i]);
			
		}
           
	}

}
