package com.fuxi;

import java.util.Scanner;

public class fuxi1 {
	private static final double[] munber = null;

	public static void main(String[] args) {
		
	
Scanner in =new  Scanner(System.in);
						int x;
						double sum= 0;
						int cnt =0;
						System.out.println("ÇëÊäÈëÊı×Ö£º");
						x= in.nextInt();
					while(x!=-1){
						sum+=x;
						cnt++;
						x=in.nextInt();	
					}
				if (cnt>0) {
					System.out.println(sum/cnt);
				}
	}
}
