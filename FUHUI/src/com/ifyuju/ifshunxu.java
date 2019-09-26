package com.ifyuju;

import java.util.Scanner;

public class ifshunxu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m=new Scanner(System.in);
		System .out .println("请输入学号：");
		long hao=m.nextLong();
		if(hao==20181104731l){
			System.out.println("欢迎进入内蒙古师范大学官网");
		}else{
			System.out.println("你不是该校学生！");
		}
		

	}

}
