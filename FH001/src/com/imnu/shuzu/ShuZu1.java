package com.imnu.shuzu;

import java.util.Arrays;
/**
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * 
 src:Դ���飻 
srcPos:Դ����Ҫ���Ƶ���ʼλ�ã� 
dest:Ŀ�����飻 
destPos:Ŀ��������õ���ʼλ�ã� 
length:���Ƶĳ��ȡ� 
ע�⣺src and dest��������ͬ���ͻ��߿��Խ���ת�����͵����飮
 * **/
public class ShuZu1 {
public static void main(String[] args) {
	int a[]={1,7,9,11,13,15,17,19};
	int b[]={2,4,46,8,10};
	int c[]=new int[a.length+b.length];
     System.arraycopy(a, 0, c,0, a.length);
     System.arraycopy(b, 0, c,a.length, b.length);
     for (int i = 0; i < c.length; i++) {
    	 System.out.print(c[i]+" ");
	}
    for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length-1; j++) {
			if (c[j] > c[j + 1]) {
				int t =c[j];
				c[j] = c[j + 1];
				c[j + 1] = t;

			}
		}
	}
    System.out.println("\n"+"�ϲ���������鰴�������У�");
      for (int h= 0; h < c.length; h++) {
		System.out.print(c[h]+" ");
	}
}
}
