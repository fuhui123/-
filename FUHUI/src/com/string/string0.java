package com.string;

import java.util.Scanner;

public class string0 {
	public static void main(String[] args) {
		/*Scanner sc =new Scanner(System.in);
		System.out.println("����������");
		String s = sc.nextLine();//��ȡ����¼���ַ������ݡ�
		System.out.println("����������-----6λ");
		int c =sc.nextInt();//��ȡ����¼���������ݡ�
		
		
		
		
		
		
		
		
		
		
		
*/		/*
		 * String:�ַ�����
		 * 		�ɶ���ַ���ɵ�һ������
		 * 		�ַ����䱾����һ���ַ�����
		 * 
		 * ���췽����
		 * 		String(String original):���ַ������ݷ�װ���ַ�������
		 * 		String(char[] value):���ַ���������ݷ�װ���ַ�������
		 * 		String(char[] value, int index, int count):���ַ������е�һ�������ݷ�װ���ַ�������
		 * 
		 * ע�⣺�ַ�����һ�ֱȽ�����������������ͣ�ֱ������ַ�������������Ǹö����е����ݡ�
		 */
						 /*   String s1 = new String("�ҁ����㣡");
							System.out.println(s1);	  
						    System.out.println("---------------------------");
						    char[] chs = {'h','e','l','l','o'};
							String s2 = new String(chs);
							System.out.println(s2);
							 System.out.println("---------------------------");
							String s3 = new String(chs,1,3);//��һ��ʼ��ȡ��ȡ3����
							System.out.println(s3);
							System.out.println("-------------------------------");
							String s4 = "hello";
							System.out.println(s4);
							System.out.println("-------------------------------");
							System.out.println(s2==s4);
							System.out.println("-------------------------------");
							System.out.println(s1==s1);*/
		
		
		
		
		
		
		
		
		
		
		
		
					/*
					 * Object:�����νṹ�еĸ��࣬���е��඼ֱ�ӻ��߼�ӵļ̳��Ը��ࡣ
					 * ���һ����������ʽ������Object����ô�������ǾͿ��Դ�������������������
					 * 
					 * String����жϹ��ܣ�
					 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ
					 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
					 * boolean startsWith(String str):�ж��ַ��������Ƿ���ָ����str��ͷ
					 * boolean endsWith(String str):�ж��ַ��������Ƿ���ָ����str��β
					 */
		/*
							//�����ַ�������
							String s1 = "hello";
							String s2 = "hello";
							String s3 = "Hello";
							
							//boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ
							System.out.println(s1.equals(s2));
							System.out.println(s1.equals(s3));
							System.out.println("-----------");
							
							//boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
							System.out.println(s1.equalsIgnoreCase(s2));
							System.out.println(s1.equalsIgnoreCase(s3));
							System.out.println("-----------");
							*/
						/*	//boolean startsWith(String str):�ж��ַ��������Ƿ���ָ����str��ͷ
							System.out.println(s1.startsWith("he"));
							System.out.println(s1.startsWith("ll"));
							
							
							
							
							
							
							
							
							
							
							
							
							 * ģ���¼,�����λ���,����ʾ���м��Ρ�
							 * 
							 * ������
							 * 		A:���������ַ����������ڴ洢�Ѿ����ڵ��û���������
							 * 		B:����¼���û���������
							 * 		C:�ü���¼����û�����������Ѿ����ڵ��û�����������бȽ�
							 * 			���������ͬ����ʾ��¼�ɹ�
							 * 			������ݲ�ͬ����ʾ��¼ʧ�ܣ�����ʾ���м��λ���
							 */
							
								/*	//���������ַ����������ڴ洢�Ѿ����ڵ��û���������
									String username = "admin";
									String password = "admin";
									
									//�����λ��ᣬ��forѭ��ʵ��
									for(int x=0; x<3; x++) {
										//����¼���û���������
										Scanner sc = new Scanner(System.in);
										System.out.println("�������û�����");
										String name = sc.nextLine();
										System.out.println("���������룺");
										String pwd = sc.nextLine();
										
										//�ü���¼����û�����������Ѿ����ڵ��û�����������бȽ�
										if(username.equals(name) && password.equals(pwd)) {
											System.out.println("��¼�ɹ�");
											break;
										}else {
											if((2-x) ==0) {
												System.out.println("�û��������뱻����,�������Ա��ϵ");
											}else {
												System.out.println("��¼ʧ��,�㻹��"+(2-x)+"�λ���"); //2,1,0
											}
										}
									}*/
		
		
		
		
		
		
		
		
		
					/*				
									 * String��Ļ�ȡ���ܣ�
									 * int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
									 * char charAt(int index):��ȡָ�����������ַ�
									 * int indexOf(String str):��ȡstr���ַ��������е�һ�γ��ֵ�����
									 * String substring(int start):��start��ʼ��ȡ�ַ���
									 * String substring(int start,int end):��start��ʼ����end������ȡ�ַ���������start��������end
									 
								
											//�����ַ�������
											String s = "helloworld";
											
											//int length():��ȡ�ַ����ĳ��ȣ���ʵҲ�����ַ�����
											System.out.println(s.length());
											System.out.println("--------");
											
											//char charAt(int index):��ȡָ�����������ַ�
											System.out.println(s.charAt(0));
											System.out.println(s.charAt(1));
											System.out.println("--------");
											
											//int indexOf(String str):��ȡstr���ַ��������е�һ�γ��ֵ�����
											System.out.println(s.indexOf("l"));
											System.out.println(s.indexOf("owo"));
											System.out.println(s.indexOf("ak"));
											System.out.println("--------");
											
											//String substring(int start):��start��ʼ��ȡ�ַ���
											System.out.println(s.substring(0));
											System.out.println(s.substring(5));
											System.out.println("--------");
											
											//String substring(int start,int end):��start��ʼ����end������ȡ�ַ���
											System.out.println(s.substring(0, s.length()));
											System.out.println(s.substring(3,8));*/
											
											
											
											
											
											
											
										/*	
											 * �����ַ���(��ȡ�ַ����е�ÿһ���ַ�)
											 
										
													//����һ���ַ�������
													String s = "abcde";
													
													//ԭʼ����
													System.out.println(s.charAt(0));
													System.out.println(s.charAt(1));
													System.out.println(s.charAt(2));
													System.out.println(s.charAt(3));
													System.out.println(s.charAt(4));
													System.out.println("---------");
													
													//��forѭ���Ľ�
													for(int x=0; x<5; x++) {
														System.out.println(s.charAt(x));
													}
													System.out.println("---------");
													
													//��length()������ȡ�ַ����ĳ���
													for(int x=0; x<s.length(); x++) {
														System.out.println(s.charAt(x));
													}
													*/
													
													
													
													
													
													
													
													
													
													
													
												
													
													/* ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
													 * 
													 * ������
													 * 		A:����¼��һ���ַ�������
													 * 		B:��������ͳ�Ʊ�������ʼ��ֵ����0
													 * 		C:�����ַ������õ�ÿһ���ַ�
													 * 		D:���ַ������ж�
													 * 			����ch��һ���ַ���
													 * 			��д��ch>='A' && ch<='Z'
													 * 			Сд��ch>='a' && ch<='z'
													 * 			���֣�ch>='0' && ch<='9'
													 * 		E:������*/
													 
													 
													
														/*	//����¼��һ���ַ�������
															Scanner sc = new Scanner(System.in);
															System.out.println("������һ���ַ������ݣ�");
															String s = sc.nextLine();
															
															//��������ͳ�Ʊ�������ʼ��ֵ����0
															int bigCount = 0;
															int smallCount = 0;
															int numberCount = 0;
														
															//�����ַ������õ�ÿһ���ַ�
															for(int x=0; x<s.length(); x++) {
																char ch = s.charAt(x);
																//���ַ������ж�
																if(ch>='A' && ch<='Z') {
																	bigCount++;
																}else if(ch>='a' && ch<='z') {
																	smallCount++;
																}else if(ch>='0' && ch<='9') {
																	numberCount++;
																}else {
																	System.out.println("���ַ�"+ch+"�Ƿ�");
																}
															}
															
															//������
															System.out.println("��д�ַ���"+bigCount+"��");
															System.out.println("Сд�ַ���"+smallCount+"��");
															System.out.println("�����ַ���"+numberCount+"��");
															*/
		
		
		
		
		
		
		
		
		
		
														/*	  String���ת�����ܣ�
															 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
															 * String toLowerCase():���ַ���ת��ΪСд�ַ���
															 * String toUpperCase():���ַ���ת��Ϊ��д�ַ���
															 * 
															 * �ַ����ı�����
															 * 		A:length()����charAt()
															 * 		B:���ַ���ת��Ϊ�ַ����飬Ȼ���������
														
																	//�����ַ�������
																	String s = "abcde";
																	
																	//char[] toCharArray():���ַ���ת��Ϊ�ַ�����
																	char[] chs = s.toCharArray();
																	for(int x=0; x<chs.length; x++) {
																		System.out.println(chs[x]);
																	}
																	System.out.println("-----------");
																	
																	//String toLowerCase():���ַ���ת��ΪСд�ַ���
																	System.out.println("HelloWorld".toLowerCase());
																	//String toUpperCase():���ַ���ת��Ϊ��д�ַ���
																	System.out.println("HelloWorld".toUpperCase());

*/
		
		
		/*
		
																	
																	 * ����¼��һ���ַ������Ѹ��ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
																	 * 
																	 * ������
																	 * 		A:����¼��һ���ַ���
																	 * 		B:��ȡ����ĸ
																	 * 		C:��ȡ��������ĸ������ַ���
																	 * 		D:Bת��д+CתСд
																	 * 		E:�������
																	 
																	
																			//����¼��һ���ַ���
																			Scanner sc = new Scanner(System.in);
																			System.out.println("������һ���ַ�����");
																			String s = sc.nextLine();
																			
																			//��ȡ����ĸ
																			String s1 = s.substring(0, 1);
																			
																			//��ȡ��������ĸ������ַ���
																			String s2 = s.substring(1);
																			
																			//Bת��д+CתСд
																			String s3 = s1.toUpperCase()+s2.toLowerCase();
																			
																			//�������
																			System.out.println("s3:"+s3);*/

		
		
		
		/*
		
		
		 * ȥ���ַ������˿ո�	
		 *		String trim()
		 * ����ָ�����ŷָ��ַ���	
		 *		String[] split(String str)
		 
				//�����ַ�������
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
				//�����ַ�������
				String s4 = "aa,bb,cc";
				String[] strArray = s4.split(",");
				for(int x=0; x<strArray.length; x++) {
					System.out.println(strArray[x]);
				}
*/
		
		
		
		
		
		
		
		
		
		
				/*
				 * �������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
				 * ������int[] arr = {1,2,3};	
				 * ��������[1, 2, 3]
				 * 
				 * ������
				 * 		A:����һ��int���͵�����
				 * 		B:д����ʵ�ְ������е�Ԫ�ذ���ָ���ĸ�ʽƴ�ӳ�һ���ַ���
				 * 		C:���÷���
				 * 		D:������
				 
						//����һ��int���͵�����
						int[] arr = {1,2,3};
						
						//д����ʵ�ְ������е�Ԫ�ذ���ָ���ĸ�ʽƴ�ӳ�һ���ַ���
						
						//���÷���
						String s = arrayToString(arr);
						
						//������
						System.out.println("s:"+s);
					}
					
					
					 * ������ȷ��
					 * 		����ֵ���ͣ�String
					 * 		�����б�int[] arr
					 
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
					 * �ַ�����ת
					 * ����������¼�롱abc��		
					 * ����������cba��
					 * 
					 * ������
					 * 		A:����¼��һ���ַ���
					 * 		B:д����ʵ���ַ����ķ�ת
					 * 			a:���ַ������ű������õ���ÿһ���ַ�ƴ�ӳ��ַ�����
					 * 			b:���ַ���ת��Ϊ�ַ����飬Ȼ����ַ�������з�ת������ڰ��ַ�����ת��Ϊ�ַ���
					 * 		C:���÷���
					 * 		D:������
					 
							//����¼��һ���ַ���
							Scanner sc = new Scanner(System.in);
							System.out.println("������һ���ַ�����");
							String s = sc.nextLine();
							
							//д����ʵ���ַ����ķ�ת
							
							//���÷���
							String result = reverse(s);
							
							//������
							System.out.println("result:"+result);
						}
						
						
						
						
						 * ���ַ������ű������õ���ÿһ���ַ�ƴ�ӳ��ַ�����
						 * 
						 * ������ȷ��
						 * 		����ֵ���ͣ�String
						 * 		�����б�String s
						 
						
						
						public static String reverse(String s) {
							String ss = "";
							
							for(int x=s.length()-1; x>=0; x--) {
								ss += s.charAt(x);
							}
							
							return ss;
						}
						
						
						//���ַ���ת��Ϊ�ַ����飬Ȼ����ַ�������з�ת������ڰ��ַ�����ת��Ϊ�ַ���
						public static String reverse(String s) {
							//���ַ���ת��Ϊ�ַ�����
							char[] chs = s.toCharArray();
							
							//���ַ�������з�ת
							for(int start=0,end=chs.length-1; start<=end; start++,end--) {
								char temp = chs[start];
								chs[start] = chs[end];
								chs[end] = temp;
							}
							
							//����ڰ��ַ�����ת��Ϊ�ַ���
							String ss = new String(chs);
							return ss;
					
							*/
		
		
		
		
		
		
		
		
		
		
		/*
		
		 * StringBuilder:��һ���ɱ���ַ������ַ����������ࡣ
		 * 
		 * String��StringBuilder������
		 * 		String�������ǹ̶��ġ�
		 * 		StringBuilder�������ǿɱ�ġ�
		 * 
		 * ���췽����
		 * 		StringBuilder()
		 * 
		 * ��Ա������
		 * 		public int capacity():���ص�ǰ����
		 * 		public int length():���س��ȣ��ַ�����
		 * 
		 * 		����������ֵ
		 * 		���ȣ�ʵ��ֵ
		 
	
				//��������
				StringBuilder sb = new StringBuilder();
				System.out.println("sb:"+sb);
				System.out.println("sb.capacity():"+sb.capacity());
				System.out.println("sb.length():"+sb.length());*/

				
				
				
				
				
				
				
				
				
				/*
				 * ��ӹ���
				 *		public StringBuilder append(��������):������ݣ��������������
				 * ��ת����
				 *		public StringBuilder reverse()
				 */
			
						//��������
						StringBuilder sb = new StringBuilder();
						
						//public StringBuilder append(��������)
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
						
						//��ʽ���
						sb.append("hello").append("world").append(true).append(100);
						
						System.out.println("sb:"+sb);
						
						//public StringBuilder reverse()
						sb.reverse();
						System.out.println("sb:"+sb);
						

				
				
				
				
				
	}

}
