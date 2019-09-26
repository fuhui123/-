package com.liexi;

public class erweishuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int a[][] = new int[3][];//创建二维数组，指定行数，不指定列数；
             a[0]= new int[]{52,64,85,12,3,64};//第一行分配5个元素
             a[1]= new int[]{41,99,2};//第二行分配3个元素
             a[2]= new int[]{285,61,278,2};//第三行分配4个元素
             for (int i = 0; i < a.length; i++) {
				System.out.print("a["+ i +"]中有" + a[i].length + "个元素，分别是：  ");
				for (int tmp : a[i]) {//foreach循环输出数组中元素
					System.out.print(tmp + "");
					}
				System.out.println();
			}
	}
}
