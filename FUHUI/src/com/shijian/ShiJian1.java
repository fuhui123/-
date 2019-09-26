package com.shijian;

import java.io.CharArrayReader;
import java.util.Scanner;

import javax.management.StringValueExp;
/**
 * 
 * 
 * */
public class ShiJian1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s = new Scanner(System.in );
          String c= s.next();
          
          switch (c) {
		case "a":
			System.out.println("A");
			break;
		case"b" :
			System.out.println("B");
			break;
		case"c" :
			System.out.println("C");
			break;
		case"d" :
			System.out.println("D");
			break;
			default:
				System.out.println("other");
			break;
		}
	}

}
