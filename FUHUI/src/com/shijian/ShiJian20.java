package com.shijian;
/**
 * ����һ��int�����飨һά����{171,72,19,16,118,51,210,7,18}
 * ���������������Ҫ���Ԫ�غͣ�
 * Ҫ��
 *        ���Ԫ�ظ�λ��ʮλ���ܰ���7������ֻ����ż����
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
