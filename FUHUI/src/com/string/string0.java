package com.string;

import java.util.Scanner;

public class string0 {
	public static void main(String[] args) {
		/*Scanner sc =new Scanner(System.in);
		System.out.println("请输入姓名");
		String s = sc.nextLine();//获取键盘录入字符串数据。
		System.out.println("请输入密码-----6位");
		int c =sc.nextInt();//获取键盘录入整数数据。
		
		
		
		
		
		
		
		
		
		
		
*/		/*
		 * String:字符串类
		 * 		由多个字符组成的一串数据
		 * 		字符串其本质是一个字符数组
		 * 
		 * 构造方法：
		 * 		String(String original):把字符串数据封装成字符串对象
		 * 		String(char[] value):把字符数组的数据封装成字符串对象
		 * 		String(char[] value, int index, int count):把字符数组中的一部分数据封装成字符串对象
		 * 
		 * 注意：字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。
		 */
						 /*   String s1 = new String("我佷优秀！");
							System.out.println(s1);	  
						    System.out.println("---------------------------");
						    char[] chs = {'h','e','l','l','o'};
							String s2 = new String(chs);
							System.out.println(s2);
							 System.out.println("---------------------------");
							String s3 = new String(chs,1,3);//从一开始截取截取3个。
							System.out.println(s3);
							System.out.println("-------------------------------");
							String s4 = "hello";
							System.out.println(s4);
							System.out.println("-------------------------------");
							System.out.println(s2==s4);
							System.out.println("-------------------------------");
							System.out.println(s1==s1);*/
		
		
		
		
		
		
		
		
		
		
		
		
					/*
					 * Object:是类层次结构中的根类，所有的类都直接或者间接的继承自该类。
					 * 如果一个方法的形式参数是Object，那么这里我们就可以传递它的任意的子类对象。
					 * 
					 * String类的判断功能：
					 * boolean equals(Object obj):比较字符串的内容是否相同
					 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
					 * boolean startsWith(String str):判断字符串对象是否以指定的str开头
					 * boolean endsWith(String str):判断字符串对象是否以指定的str结尾
					 */
		/*
							//创建字符串对象
							String s1 = "hello";
							String s2 = "hello";
							String s3 = "Hello";
							
							//boolean equals(Object obj):比较字符串的内容是否相同
							System.out.println(s1.equals(s2));
							System.out.println(s1.equals(s3));
							System.out.println("-----------");
							
							//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
							System.out.println(s1.equalsIgnoreCase(s2));
							System.out.println(s1.equalsIgnoreCase(s3));
							System.out.println("-----------");
							*/
						/*	//boolean startsWith(String str):判断字符串对象是否以指定的str开头
							System.out.println(s1.startsWith("he"));
							System.out.println(s1.startsWith("ll"));
							
							
							
							
							
							
							
							
							
							
							
							
							 * 模拟登录,给三次机会,并提示还有几次。
							 * 
							 * 分析：
							 * 		A:定义两个字符串对象，用于存储已经存在的用户名和密码
							 * 		B:键盘录入用户名和密码
							 * 		C:拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
							 * 			如果内容相同，提示登录成功
							 * 			如果内容不同，提示登录失败，并提示还有几次机会
							 */
							
								/*	//定义两个字符串对象，用于存储已经存在的用户名和密码
									String username = "admin";
									String password = "admin";
									
									//给三次机会，用for循环实现
									for(int x=0; x<3; x++) {
										//键盘录入用户名和密码
										Scanner sc = new Scanner(System.in);
										System.out.println("请输入用户名：");
										String name = sc.nextLine();
										System.out.println("请输入密码：");
										String pwd = sc.nextLine();
										
										//拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
										if(username.equals(name) && password.equals(pwd)) {
											System.out.println("登录成功");
											break;
										}else {
											if((2-x) ==0) {
												System.out.println("用户名和密码被锁定,请与管理员联系");
											}else {
												System.out.println("登录失败,你还有"+(2-x)+"次机会"); //2,1,0
											}
										}
									}*/
		
		
		
		
		
		
		
		
		
					/*				
									 * String类的获取功能：
									 * int length():获取字符串的长度，其实也就是字符个数
									 * char charAt(int index):获取指定索引处的字符
									 * int indexOf(String str):获取str在字符串对象中第一次出现的索引
									 * String substring(int start):从start开始截取字符串
									 * String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end
									 
								
											//创建字符串对象
											String s = "helloworld";
											
											//int length():获取字符串的长度，其实也就是字符个数
											System.out.println(s.length());
											System.out.println("--------");
											
											//char charAt(int index):获取指定索引处的字符
											System.out.println(s.charAt(0));
											System.out.println(s.charAt(1));
											System.out.println("--------");
											
											//int indexOf(String str):获取str在字符串对象中第一次出现的索引
											System.out.println(s.indexOf("l"));
											System.out.println(s.indexOf("owo"));
											System.out.println(s.indexOf("ak"));
											System.out.println("--------");
											
											//String substring(int start):从start开始截取字符串
											System.out.println(s.substring(0));
											System.out.println(s.substring(5));
											System.out.println("--------");
											
											//String substring(int start,int end):从start开始，到end结束截取字符串
											System.out.println(s.substring(0, s.length()));
											System.out.println(s.substring(3,8));*/
											
											
											
											
											
											
											
										/*	
											 * 遍历字符串(获取字符串中的每一个字符)
											 
										
													//创建一个字符串对象
													String s = "abcde";
													
													//原始做法
													System.out.println(s.charAt(0));
													System.out.println(s.charAt(1));
													System.out.println(s.charAt(2));
													System.out.println(s.charAt(3));
													System.out.println(s.charAt(4));
													System.out.println("---------");
													
													//用for循环改进
													for(int x=0; x<5; x++) {
														System.out.println(s.charAt(x));
													}
													System.out.println("---------");
													
													//用length()方法获取字符串的长度
													for(int x=0; x<s.length(); x++) {
														System.out.println(s.charAt(x));
													}
													*/
													
													
													
													
													
													
													
													
													
													
													
												
													
													/* 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
													 * 
													 * 分析：
													 * 		A:键盘录入一个字符串数据
													 * 		B:定义三个统计变量，初始化值都是0
													 * 		C:遍历字符串，得到每一个字符
													 * 		D:拿字符进行判断
													 * 			假如ch是一个字符。
													 * 			大写：ch>='A' && ch<='Z'
													 * 			小写：ch>='a' && ch<='z'
													 * 			数字：ch>='0' && ch<='9'
													 * 		E:输出结果*/
													 
													 
													
														/*	//键盘录入一个字符串数据
															Scanner sc = new Scanner(System.in);
															System.out.println("请输入一个字符串数据：");
															String s = sc.nextLine();
															
															//定义三个统计变量，初始化值都是0
															int bigCount = 0;
															int smallCount = 0;
															int numberCount = 0;
														
															//遍历字符串，得到每一个字符
															for(int x=0; x<s.length(); x++) {
																char ch = s.charAt(x);
																//拿字符进行判断
																if(ch>='A' && ch<='Z') {
																	bigCount++;
																}else if(ch>='a' && ch<='z') {
																	smallCount++;
																}else if(ch>='0' && ch<='9') {
																	numberCount++;
																}else {
																	System.out.println("该字符"+ch+"非法");
																}
															}
															
															//输出结果
															System.out.println("大写字符："+bigCount+"个");
															System.out.println("小写字符："+smallCount+"个");
															System.out.println("数字字符："+numberCount+"个");
															*/
		
		
		
		
		
		
		
		
		
		
														/*	  String类的转换功能：
															 * char[] toCharArray():把字符串转换为字符数组
															 * String toLowerCase():把字符串转换为小写字符串
															 * String toUpperCase():把字符串转换为大写字符串
															 * 
															 * 字符串的遍历：
															 * 		A:length()加上charAt()
															 * 		B:把字符串转换为字符数组，然后遍历数组
														
																	//创建字符串对象
																	String s = "abcde";
																	
																	//char[] toCharArray():把字符串转换为字符数组
																	char[] chs = s.toCharArray();
																	for(int x=0; x<chs.length; x++) {
																		System.out.println(chs[x]);
																	}
																	System.out.println("-----------");
																	
																	//String toLowerCase():把字符串转换为小写字符串
																	System.out.println("HelloWorld".toLowerCase());
																	//String toUpperCase():把字符串转换为大写字符串
																	System.out.println("HelloWorld".toUpperCase());

*/
		
		
		/*
		
																	
																	 * 键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
																	 * 
																	 * 分析：
																	 * 		A:键盘录入一个字符串
																	 * 		B:截取首字母
																	 * 		C:截取除了首字母以外的字符串
																	 * 		D:B转大写+C转小写
																	 * 		E:输出即可
																	 
																	
																			//键盘录入一个字符串
																			Scanner sc = new Scanner(System.in);
																			System.out.println("请输入一个字符串：");
																			String s = sc.nextLine();
																			
																			//截取首字母
																			String s1 = s.substring(0, 1);
																			
																			//截取除了首字母以外的字符串
																			String s2 = s.substring(1);
																			
																			//B转大写+C转小写
																			String s3 = s1.toUpperCase()+s2.toLowerCase();
																			
																			//输出即可
																			System.out.println("s3:"+s3);*/

		
		
		
		/*
		
		
		 * 去除字符串两端空格	
		 *		String trim()
		 * 按照指定符号分割字符串	
		 *		String[] split(String str)
		 
				//创建字符串对象
				String s1 = "helloworld";
				String s2 = "  helloworld  ";
				String s3 = "  hello  world  ";
				System.out.println("---"+s1+"---");
				System.out.println("---"+s1.trim()+"---");
				System.out.println("---"+s2+"---");
				System.out.println("---"+s2.trim()+"---");
				System.out.println("---"+s3+"---");
				System.out.println("---"+s3.trim()+"---");
				System.out.println("-------------------");
		                                                               
				//String[] split(String str)
				//创建字符串对象
				String s4 = "aa,bb,cc";
				String[] strArray = s4.split(",");
				for(int x=0; x<strArray.length; x++) {
					System.out.println(strArray[x]);
				}
*/
		
		
		
		
		
		
		
		
		
		
				/*
				 * 把数组中的数据按照指定个格式拼接成一个字符串
				 * 举例：int[] arr = {1,2,3};	
				 * 输出结果：[1, 2, 3]
				 * 
				 * 分析：
				 * 		A:定义一个int类型的数组
				 * 		B:写方法实现把数组中的元素按照指定的格式拼接成一个字符串
				 * 		C:调用方法
				 * 		D:输出结果
				 
						//定义一个int类型的数组
						int[] arr = {1,2,3};
						
						//写方法实现把数组中的元素按照指定的格式拼接成一个字符串
						
						//调用方法
						String s = arrayToString(arr);
						
						//输出结果
						System.out.println("s:"+s);
					}
					
					
					 * 两个明确：
					 * 		返回值类型：String
					 * 		参数列表：int[] arr
					 
					public static String arrayToString(int[] arr) {
						String s = "";
						
						//[1, 2, 3]
						s += "[";
						for(int x=0; x<arr.length; x++) {
							if(x==arr.length-1) {
								s += arr[x];
							}else {
								s += arr[x];
								s += ", ";
							}
						}
						s += "]";
						return s;

		*/
		
						
						
						
						
						
						
						
						
						
						
						


/*					
					 * 字符串反转
					 * 举例：键盘录入”abc”		
					 * 输出结果：”cba”
					 * 
					 * 分析：
					 * 		A:键盘录入一个字符串
					 * 		B:写方法实现字符串的反转
					 * 			a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
					 * 			b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
					 * 		C:调用方法
					 * 		D:输出结果
					 
							//键盘录入一个字符串
							Scanner sc = new Scanner(System.in);
							System.out.println("请输入一个字符串：");
							String s = sc.nextLine();
							
							//写方法实现字符串的反转
							
							//调用方法
							String result = reverse(s);
							
							//输出结果
							System.out.println("result:"+result);
						}
						
						
						
						
						 * 把字符串倒着遍历，得到的每一个字符拼接成字符串。
						 * 
						 * 两个明确：
						 * 		返回值类型：String
						 * 		参数列表：String s
						 
						
						
						public static String reverse(String s) {
							String ss = "";
							
							for(int x=s.length()-1; x>=0; x--) {
								ss += s.charAt(x);
							}
							
							return ss;
						}
						
						
						//把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
						public static String reverse(String s) {
							//把字符串转换为字符数组
							char[] chs = s.toCharArray();
							
							//对字符数组进行反转
							for(int start=0,end=chs.length-1; start<=end; start++,end--) {
								char temp = chs[start];
								chs[start] = chs[end];
								chs[end] = temp;
							}
							
							//最后在把字符数组转换为字符串
							String ss = new String(chs);
							return ss;
					
							*/
		
		
		
		
		
		
		
		
		
		
		/*
		
		 * StringBuilder:是一个可变的字符串。字符串缓冲区类。
		 * 
		 * String和StringBuilder的区别：
		 * 		String的内容是固定的。
		 * 		StringBuilder的内容是可变的。
		 * 
		 * 构造方法：
		 * 		StringBuilder()
		 * 
		 * 成员方法：
		 * 		public int capacity():返回当前容量
		 * 		public int length():返回长度（字符数）
		 * 
		 * 		容量：理论值
		 * 		长度：实际值
		 
	
				//创建对象
				StringBuilder sb = new StringBuilder();
				System.out.println("sb:"+sb);
				System.out.println("sb.capacity():"+sb.capacity());
				System.out.println("sb.length():"+sb.length());*/

				
				
				
				
				
				
				
				
				
				/*
				 * 添加功能
				 *		public StringBuilder append(任意类型):添加数据，并返回自身对象
				 * 反转功能
				 *		public StringBuilder reverse()
				 */
			
						//创建对象
						StringBuilder sb = new StringBuilder();
						
						//public StringBuilder append(任意类型)
						//StringBuilder sb2 = sb.append("hello");
						
						/*
						System.out.println("sb:"+sb);
						System.out.println("sb2:"+sb2);
						System.out.println(sb == sb2); //true
						*/
						
						/*
						sb.append("hello");
						sb.append("world");
						sb.append(true);
						sb.append(100);
						*/
						
						//链式编程
						sb.append("hello").append("world").append(true).append(100);
						
						System.out.println("sb:"+sb);
						
						//public StringBuilder reverse()
						sb.reverse();
						System.out.println("sb:"+sb);
						

				
				
				
				
				
	}

}
