package com.liexi;

import java.util.Arrays;

public class tihuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] =new int[]{45 , 12, 2, 77, 31, 91, 10};//定义并初化int型数组arr
           Arrays.fill(arr, 1, 4, 8);//使用fill()方法度数组进行填充
           for (int i = 0; i < arr.length; i++) {//循环遍历数组中的元素
        	   //将数组中的每一个元素输出
        	   System.out.println("第"+ i + "个元素是：" +arr[i]);
			
		}
           
	}

}
