package com.imnu.shuzu;

import java.util.Arrays;
/**
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * 
 src:源数组； 
srcPos:源数组要复制的起始位置； 
dest:目的数组； 
destPos:目的数组放置的起始位置； 
length:复制的长度。 
注意：src and dest都必须是同类型或者可以进行转换类型的数组．
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
    System.out.println("\n"+"合并后的新数组按升序排列：");
      for (int h= 0; h < c.length; h++) {
		System.out.print(c[h]+" ");
	}
}
}
