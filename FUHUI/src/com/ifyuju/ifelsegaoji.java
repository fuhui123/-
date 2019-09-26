package com.ifyuju;

import java.util.Scanner;

public class ifelsegaoji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int iYear;
		Scanner sc=new Scanner(System .in);
	System.out.println("please imput number:");
	 iYear = sc.nextInt();
	if(iYear%4==0){
		if(iYear%100==0){
			if(iYear%400==0)
				System.out.println("It is a leep year");
			else
				System.out.println("It is not a leep year");
		}else
			System.out.println("It is a leep year");
	}else
		System.out.println("It is not a leep year");
		}
}*/
		
		int iYear;
		Scanner sc = new Scanner(System .in );
		System.out.println("please imput number");
		iYear =sc.nextInt();
		if(iYear%4==0&& iYear%100==0 ){
			if(iYear%400==0)
			System.out.println("It is a leep year");
		}else
				System.out.println("It is not a leep year");
		}
	
		}
		

		

