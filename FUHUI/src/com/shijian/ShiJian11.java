package com.shijian;
/**
 * 1���ѱ�������Ľ�Ϊ����ʵ�֣������÷����� 
 * 2����ȡ������ֵ���Ľ�Ϊ����ʵ�֣������÷�����
 *  3��дһ�����������ڶ����������ͣ������÷�����
 */
public class ShiJian11 {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			// printArray(arr);

		}
		printArray(arr);
	}

	/*
	 * public static void printArray(int arr[]) { for (int i = 0; i <
	 * arr.length; i++) { System.out.println(arr[i]); }
	 * 
	 * }
	 */
	public static void printArray(int arr[]) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr[i] );
			if (i == arr.length - 1) {
				System.err.println(arr[i] + "]");
			} else {
				System.err.print(arr[i] + ",  ");
			}
		}

	}

}
