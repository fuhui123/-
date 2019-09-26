package com.imnu.home;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TongJi {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>(); 	//创建集合对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你要输入的数字，以0为止结束");
		while(true){							//通过循环给集合添加元素，到0则跳出循环
			int num=sc.nextInt();				
			list1.add(num);
			if(num==0){
				break;
			}
		}
		Object[] arr=list1.toArray();			//将list1中的元素存入arr数组
		Set<Object> s=new HashSet<Object>();	//HashSet用于去掉重复的元素
		for (Object o : arr) {  				//将数组中的元素放入集合s中
		       s.add(o);  
		    } 									// 现在的集合s中无重复的包含arr中的所有元素  
	    Object[] obj = s.toArray();			// 把集合s中的元素存入数组obj中，即obj的元素是arr中无重复的所有元素  
	    int[] n = new int[obj.length];		// 这个数组用来存放每一个元素出现的次数  
	    int max = 0;      					// 最多次数计数器
	    for (int i = 0; i < obj.length; i++) {  
	       int count = 0;  					//记录数组中每个元素的出现次数的计数器，每个循环重置一次
	       for (int j = 0; j < arr.length; j++) {  
	           if (obj[i].equals(arr[j]))  	//将这个去掉重复元素的数组和原数组中的元素逐一比较
	              count++;  				//如果相同，count次数加1，最后count为该元素出现的次数
	       }  
	       n[i] = count;					// 每一个元素出现的次数存入数组n  
	                  						// 数组n的下标i跟数组obj的下标是一一对应的，长度一样  
	       if (max < count) {				// 如果该元素的次数比目前最多次数多，则替代最多次数
	           max = count;  
	       }  
	    }  
	    for (int i = 0; i < n.length; i++) {// 最后遍历存放元素次数的数组 
	       if (max == n[i]) {  
			// 如果出现的次数等于最大次数，就输出数组obj中对应索引处的元素，因为长度一样  
	           System.out.println("最多的数是："+obj[i]+"\t "+"有"+n[i]+"次");  
	       }  
	    }  
	  
	
	}
	}

