package com.ShangKe;

import javax.swing.Spring;

/**
 * 存储原理？
 * 怎么存？
 * 存哪里？
 * string---对象
 * 1：获得对象
 * 2： 了解对象（能干啥？行为，特征）包括属性和方法。（eating,sleep.......）
 * 3：用行为处理要求。(应用)
 * 4：获得想要的结果。
 * 类（class）.java文件-----对象
 * new----实例化
 * java核心类
 * */
public class Ke4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //String str =new String();
             //str ="贺文是一个老师";
		//Spring str="贺文是一个老师";
		//String strint =123+"";
            // str.charAt(0);
             /*System.out.println( str.charAt(0));
             System.out.println( str.length());
             System.out.println( str.charAt(str.length()-1));
             System.out.println( str.codePointAt(0));
             System.out.println( str.codePointBefore(1));
             String b ="贺文是一个老师";
             if (str.compareTo(b) ==0) {
            	// 不要用这种方法比较字符串
				System.out.println("str和b是同一个字符串");
			}if (str==b) {
				System.out.println("str和b是同一个字符串-2");
*/
			
			/*System.out.println(str.concat("?"));
			System.out.println(str.endsWith("老师"));
			if (str.endsWith("老师")) {
				System.out.println("这个是老师");
			}else {
				System.out.println("这个不是老师");
			}*/
			//char b1 ='贺';
			/*String b1 ="贺";
			System.err.println(str.equals(b1));
			*/
			/*System.out.println(str.substring(2));
			System.out.println(str.substring(2,4));
			System.out.println(str.replace('贺', '长'));
			System.out.println(str.indexOf(3));
			System.out.println(str.indexOf("是"));
			System.out.println(str.lastIndexOf("是"));
             System.out.println( str.compareTo("贺文是一个老师"));
*/
	/**
	 * 获取某个文件的扩展名：
	 * String ur1 ="http://www.baidu.com/imgaes
	 * /20181104172530.png"
*/
		String ur1 =new String ();
		ur1 ="http://www.baidu.com/imgaes/20181104172530.png";
		System.out.println(ur1.substring(ur1.lastIndexOf(".")+1));
		
	}}
