package com.liexi;

import java.util.Scanner;

public class ShangKe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           /*java 语法
            * 1：分支结构，=程序框图  如果 。。。。那么。。。。句子写成java语言
            * if(布尔类型Boolean(ture or false)){ {}中写代码    //不能做判断。
            * }else或者(！ture){
            *        }
            * {}代表实现
            *  对象里只能有方法和属性。
            * ！ture=false
            * 要学会分析问题的能力
            * 
            * 
            * */
		
		 Scanner a= new Scanner(System.in );
         System.out.println("请输入成绩：");
        int n=a.nextInt();
		if (n>=80) {
			System.out.println("你佷优秀");
			}
		else if (n>=60) {
			System.out.println("继续努力！");
			}
		else if (n<60) {
			System.out.println("你挂科了！");
			
		}
			
		}
	}
