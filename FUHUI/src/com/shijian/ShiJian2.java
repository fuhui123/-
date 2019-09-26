package com.shijian;

import java.util.Scanner;

public class ShiJian2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("请输出月份：");
           Scanner s  = new Scanner(System.in ); 
           int c =s.nextInt();
           switch (c) {
		    case 1:
			case 2:
			case 12:
				System.out.println("冬天");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋天");
				break;
            default:
			System.out.println("输入有误");
			break;
		}
		}
	}
