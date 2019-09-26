 package com.shijian;
public class ShiJian15 {
public static void main(String[] args) {
	int arr[] ={3,45,78,34,89};
	for (int i = 0; i < arr.length; i++) {
		for (int j =0; j < arr.length-i; j++) {
			if (arr[j]>arr[j+1]) {
				int temp =arr[j];
				arr[j] =arr[j+1];
				arr[j+1] =temp;
				System.out.println("Ã°ÅÝÅÅÐò½á¹û£º");
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k]+" ");
					}
				System.out.println();
			}
		}
	}
}
}
