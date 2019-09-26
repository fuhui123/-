package com.shijian;
/**
 * 定义一个int型数组（一维）；{171,72,19,16,118,51,210,7,18}
 * 求出该数组中满足要求的元素和；
 * 要求：
 *        求和元素个位和十位不能包含7，并且只能是偶数。
 * */
public class ShiJian20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				      int arr[] ={171,72,19,16,118,51,210,7,18};
				      int sum =0;
				for (int i = 0; i < arr.length; i++) {
					  if (arr[i]%10!=7&&arr[i]/10%10!=7&&arr[i]%2==0) {
						     sum +=arr[i];
					}
				}
				System.out.println(sum);
					}
				
				}
