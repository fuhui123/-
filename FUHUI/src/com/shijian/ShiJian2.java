package com.shijian;

import java.util.Scanner;

public class ShiJian2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("������·ݣ�");
           Scanner s  = new Scanner(System.in ); 
           int c =s.nextInt();
           switch (c) {
		    case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("����");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("����");
				break;
            default:
			System.out.println("��������");
			break;
		}
		}
	}
