package com.imnu.shuzu;


import java.util.Arrays;

public class ShuZu {

	public static void main(String[] args) {
		int oldArr[] = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		for (int i = 0; i < oldArr.length; i++) {
			for (int j = 0; j < oldArr.length - 1; j++) {
				if (oldArr[j] > oldArr[j + 1]) {
					int temp = oldArr[j];
					oldArr[j] = oldArr[j + 1];
					oldArr[j + 1] = temp;

				}
			}

		}
		/*for (int m = 0; m < oldArr.length; m++) {

			System.out.print(oldArr[m]);
		}*/
		int newArr[] = Arrays.copyOfRange(oldArr, 4, 15);
		System.out.println("新数组是：");
		for (int h = 0; h < newArr.length; h++) {
			System.out.print(newArr[h]);
		}

	}

}
