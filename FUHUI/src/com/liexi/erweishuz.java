package com.liexi;

public class erweishuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int a[][] = new int[3][];//������ά���飬ָ����������ָ��������
             a[0]= new int[]{52,64,85,12,3,64};//��һ�з���5��Ԫ��
             a[1]= new int[]{41,99,2};//�ڶ��з���3��Ԫ��
             a[2]= new int[]{285,61,278,2};//�����з���4��Ԫ��
             for (int i = 0; i < a.length; i++) {
				System.out.print("a["+ i +"]����" + a[i].length + "��Ԫ�أ��ֱ��ǣ�  ");
				for (int tmp : a[i]) {//foreachѭ�����������Ԫ��
					System.out.print(tmp + "");
					}
				System.out.println();
			}
	}
}
