package com.shijian;
import java.util.Random;
import java.util.Scanner;
public class ShiJian5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Random r = new Random();
           int number = r.nextInt(100)+1;
           while(true){
        	   Scanner  s = new  Scanner(System.in);
        	   System.out.println("��������µ�������0-100");
        	  int a = s.nextInt();
        	  if (a>number) {
        		  System.out.println("̫����");
				
			}else if (a<number) {
				System.out.println("̫С��");
           }else {
			System.out.println("��ϲ�㣬�¶��ˣ�");
		}
           
	}
		
	}}
		
		
		
		
		
