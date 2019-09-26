package com.shijian;
public class ShiJian14 {
public static void  sort(int[]arr) {
	for (int i = 1; i < arr.length; i++) {
		//比较相邻俩个元素，较大的数往后冒泡
		for (int j = 0; j < arr.length-i; j++) {
		if (arr[j]>arr[j+1]) {//如果前一个元素比后一个元素大，则俩元素互换
			int temp =arr[j];//把第一个元素值保存到临时变量中。
			arr[j] =arr[j+1];//把第二个元素值保存到第一个元素单元中。
			arr[j+1] =temp;//把临时变量（也就是第一个元素原值）保存到第二个元素中。
			}
		}
	}
	      fh   (arr);//输出冒泡排序后的数组元素
	}
public static void fh(int[]arr){
	System.out.println("冒泡排序结果：");
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]+" ");//输出每个数组元素值
		}
	System.out.println();
}
public static void main (String[] args){
	//创建一个数组 ，乱序的。
	int[]arr ={63,4,24,1,3,15,89};
	ShiJian14  b= new ShiJian14();
    sort(arr);
}
}
