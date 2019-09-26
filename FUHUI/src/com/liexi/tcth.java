package com.liexi;

import java.util.Arrays;

public class tcth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] =new int[5];//创建int型数组
          Arrays.fill(arr, 8);//使用同一个值对数组进行填充
          for (int i = 0; i < arr.length; i++) {
        	  //将数组中的元素依次输出
        	  System.out.println("第"+i+"个元素是："+ arr[i]);
			
		}
	}

}
