package com.shijian;
/**
 * ��ȡ������ֵ���Ľ�Ϊ����ʵ�֣������÷���
 * ���ֵ------��Сֵ
 * */
public class ShiJian12 {

	private static int[] arr;

	public static void main(String[] args) {
		// ��ȡ���ֵ��
		/*
		 * //�������� int[] arr ={12,34,45,56,67}; //��������� int max =arr[0]; //�������飬
		 * ��ȡԪ�أ����αȽϡ� for (int x = 0; x < arr.length; x++) { if (arr[x]>max) {
		 * max=arr[x]; } }System.out.println("max:"+max);
		 */
		// ��ȡ��Сֵ
		/*
		 * //�������� int[] arr ={12,34,45,56,67}; //��������� int s =arr[0]; //�������飬
		 * ��ȡԪ�أ����αȽϡ� for (int x = 0; x < arr.length; x++) { if (arr[x]<s) {
		 * s=arr[x]; } }System.out.println("s:"+s);
		 */
		// ��ȡ������ֵ���Ľ�Ϊ����ʵ�֣������÷���

	int []arr ={12,23,34,45,56,67,78};	
	
	/*int max =getMax(arr);
	System.out.println("max:"+max);
}
	
	public static int getMax(int [] arr){
		int max=arr[0];
		for (int x = 0; x < arr.length; x++) {
			 if (arr[x]>max) {
				 max =arr[x];
				
			}
		}
		return max;*/
	int small =getSmall(arr);
	System.out.println("small:"+small);
}
	
	private static int getSmall(int[] arr) {
		// TODO Auto-generated method stub
		int small=arr[0];
		for (int x = 0; x < arr.length; x++) {
			 if (arr[x]<small) {
				small=arr[x];
			}
		}
	     return small;	
}
}
