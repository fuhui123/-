package com.shijian;
public class ShiJian14 {
public static void  sort(int[]arr) {
	for (int i = 1; i < arr.length; i++) {
		//�Ƚ���������Ԫ�أ��ϴ��������ð��
		for (int j = 0; j < arr.length-i; j++) {
		if (arr[j]>arr[j+1]) {//���ǰһ��Ԫ�رȺ�һ��Ԫ�ش�����Ԫ�ػ���
			int temp =arr[j];//�ѵ�һ��Ԫ��ֵ���浽��ʱ�����С�
			arr[j] =arr[j+1];//�ѵڶ���Ԫ��ֵ���浽��һ��Ԫ�ص�Ԫ�С�
			arr[j+1] =temp;//����ʱ������Ҳ���ǵ�һ��Ԫ��ԭֵ�����浽�ڶ���Ԫ���С�
			}
		}
	}
	      fh   (arr);//���ð������������Ԫ��
	}
public static void fh(int[]arr){
	System.out.println("ð����������");
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]+" ");//���ÿ������Ԫ��ֵ
		}
	System.out.println();
}
public static void main (String[] args){
	//����һ������ ������ġ�
	int[]arr ={63,4,24,1,3,15,89};
	ShiJian14  b= new ShiJian14();
    sort(arr);
}
}
