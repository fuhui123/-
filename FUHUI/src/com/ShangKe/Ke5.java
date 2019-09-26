package com.ShangKe;

import java.util.Scanner;

/**
 *" ."行为 and属性（一般不能动（private）；通过公共方法调用或修改；）
 * 修饰符：“ public   private    protect     static         final                    空          ”
 *                    公共的     私有的       受保护的     静态的    谁也不准动             没用
 *                   ｛             访问权限                   ｝                   0修改（常量）     可以=public
 *       static     直接可以用的 （ 已经有的） 直接放在内存中     
 *       import 导包 这个iava文件中要用到其他package里的java文件；
 *       如果在同一个包里，无需导包
 *       导包要用自动导包    
 *       ().equals()    判断是否相同      
 *       标识符                                                 
 * 
 * 构造方法：
 * 		给对象的数据进行初始化
 * 
 * 格式：
 * 		方法名和类名相同
 * 		没有返回值类型，连void都不能写
 * 		没有具体的返回值
 * 
 * 构造方法的注意事项：
 * 		A:如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法供我们使用。
 * 		B:如果我们给出了构造方法，系统将不在提供默认的无参构造方法供我们使用。
 *        这个时候，如果我们想使用无参构造方法，就必须自己提供。
 *        推荐：自己给无参构造方法
 *      C:构造方法也是可以重载的
 * 
 * 成员变量赋值：
 * 		A:setXxx()方法
 * 		B:带参构造方法	
    如何调用构造方法呢?
		//通过new关键字调用
		//格式：类名 对象名 = new 构造方法(...);
		Student s = new Student();

 */
public class Ke5 {
public static void main(String[] args) {
	
		System.out.println("请选择：");
		System.err.println("1.学习");
		System.err.println("2.复习");
		System.err.println("3.考试");
		System.err.println("4.退出");
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();		
		switch (a) {
		case 1:
			System.out.println("欢迎进入学习平台！");
			System.out.println("请选择方式：");
			System.out.println("1:视频教学");
			System.out.println("2.ppt教学");
			System.out.println("3.word教学");
			Scanner sc =new Scanner(System.in);
			int c=sc.nextInt();	
			switch (c) {
			case 1:
				System.out.println("视频1");
				System.out.println("视频2");
				System.out.println("视频3");
				break ;
			case 2:
				System.out.println("ppt 1");
				System.out.println("ppt 2");
			case 3:
				System.out.println("word  1");
				System.out.println("word  2");
			}
			break;
		case 2:
			System.out.println("温故而知新，可以为师也！");
			System.out.println("请选择章节：");
			System.out.println("第1章	面向对象概述");
			System.out.println("第2章	面向对象特性之封装");
			System.out.println("第3章	面向对象之构造方法");
			Scanner scc =new Scanner(System.in);
			int d=scc.nextInt();	
			switch (d) {
			case 1:
				System.out.println("1.1	面向对象思想");
				System.out.println("1.2	面向过程特点与面向对象特点");
				break;
			case 2:
				System.out.println("2.1	 封装与私有关键字");
				System.out.println("2.2	this关键字");
				break;
			case 3:
				System.out.println("3.1	构造方法:");
				break;
			}
			break;
		case 3:
			System.out.println("你准备好了吗？");
			System.out.println("考试开始！");
			break;
		case 4:
			System.out.println("谢谢使用！");
			break;
		}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}