package com.shijian;
/**
 * 1：把遍历数组改进为方法实现，并调用方法。 
 * 2：获取数组最值并改进为方法实现，并调用方法。
 *  3：写一个方法，用于对数组进行求和，并调用方法。
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
