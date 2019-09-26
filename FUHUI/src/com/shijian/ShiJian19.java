package com.shijian;
/**
 * 有一对兔子，从出生起第三个月起每一个月都生一对兔子，小兔子长到第
 * 三个月后每一个月都生一对兔子。
 * 问：假如兔子都不死，第20个月的兔子对数有多少？
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
