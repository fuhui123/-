package com.shijian;

/**
 * ��������������������ͣ� ��ʽ�����ı�ֱ��Ӱ��ʵ�ʲ���
 */
public class ShiJian10 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
			}
		System.out.println("------------------------");
		change(a);
		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}
	}

	private static void change(int[] a) {
		for (int x = 0; x < a.length; x++) {
			if (a[x] % 2 != 0) {
				a[x] *= a[x];

			}
		}

	}

}
