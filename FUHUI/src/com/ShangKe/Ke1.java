package com.ShangKe;

import java.util.Scanner;

/**
 * 类的注释
 * */
public class Ke1 {
	/**
	 * 入口方法描述
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*byte[]b ={97,98,99};//初化一个字节数组b,一维数组。
		//通过构造器，将字节数组中的元素连接成一个字符串
		String why =new String(b);
		System.out.println(why);*/
		
		
		
		
		/*byte[]b ={97,98,99,100,101,102};
		String d = new String(b,3,2);//不明白？
		System.out.println(d);*/
		
		
		
		
		
		
		//char[]c ={'w','e','l','c','o','m','e'};
		//通过构造器，将字符数组中的元素连接成一个字符串
		//String str = new String(c);
		//System.out.println(str);
		//String str = new String(c,3,4);
		//System.out.println(str);
		
		
		
		/*String str1 ="you";
		String str2 ="welcome";
		System.out.println(str1.concat(str2));
		*/
		
		
		/**1:基本数据类型
		 * 2：强制转换
		 * 
		 * 
		 * 
		 * */
		/*int a =1515464644;//最大放2的32次方
		int b=2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2;
		System.out.println(b);
		long c=123131313213672l;
		short d=12312;
		byte  e=127;*/
		//127+127=254;
		/*byte a =1;
		byte b=2;
		//int c=a+b;//byte+byte=int
		byte c=(byte) (a+b);//强转
*/	
	/*char a ='a';//a=97;
	int b =2;
	//int c = a+b;
	char c=(char) (a+b);
	System.out.println(c);
	int s=(int)'刘';
	int hs=(int)'璐';
	System.out.println(s);
	System.out.println(hs);
	int k=(int)'辛';
	int m=(int)'悦';
	System.out.println(k);
	System.out.println(m);*/
	//float a=1.5f;
	//double b=1.5;
    //float c=(float) 1.5d;//精度只能从小转大，大转小需要强制转换；
	/*int d=(20184);//20184+89=伱
	char g=(char)d;
	System.out.println(g);
	char e='天';
	int h=(int)e;
	System.out.println(h);*/
		
		
		
		/*boolean b=true;
		boolean c=false;
		//判断
*/		
		 Scanner a= new Scanner(System.in );
         System.out.println("请输入学号：");
        int n=a.nextInt();		
		if (n==4731) {
			System.out.println("付慧");
			
		}
		else if(n==4726){
			 System.out.println("刘璐");
		}else if (n==4725) {
			 System.out.println("张博闻");
		}else if (n==4732) {
			 System.out.println("王淳");
		}else if (n==4730) {
			 System.out.println("郝宁");
		}else if (n==4724) {
		     System.out.println("马加驰");
			
		} else if (n==4733)  {
			 System.out.println("白科");
		}else if (n==4723) {
			 System.out.println("王艺超");
		}
		     System.out.println("鄂尔多斯人");
		
	} 
  
}
