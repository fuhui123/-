package com.shijian;
/**
 * 获取数组最值并改进为方法实现，并调用方法
 * 最大值------最小值
 * */
public class ShiJian12 {

	private static int[] arr;

	public static void main(String[] args) {
		// 获取最大值。
		/*
		 * //定义数组 int[] arr ={12,34,45,56,67}; //定义参照物 int max =arr[0]; //遍历数组，
		 * 获取元素，依次比较。 for (int x = 0; x < arr.length; x++) { if (arr[x]>max) {
		 * max=arr[x]; } }System.out.println("max:"+max);
		 */
		// 获取最小值
		/*
		 * //定义数组 int[] arr ={12,34,45,56,67}; //定义参照物 int s =arr[0]; //遍历数组，
		 * 获取元素，依次比较。 for (int x = 0; x < arr.length; x++) { if (arr[x]<s) {
		 * s=arr[x]; } }System.out.println("s:"+s);
		 */
		// 获取数组最值并改进为方法实现，并调用方法

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
