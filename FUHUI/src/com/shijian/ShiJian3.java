package com.shijian;
/**
 * 输入所有水仙花数，所谓水仙花是指一个三位数，各个位上数字立方和等于其本身
 * 例如153=1*1*1+5*5*5+3*3*3
 * */
public class ShiJian3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for (int i = 100; i < 1000; i++) {//实现100-999的遍历
		    int j1 =i/100;//百位
			int j2 =(i-j1*100)/10;//十位
			int j3 =i%10;//取膜
			if(i==j1*j1*j1+j2*j2*j2+j3*j3*j3){
				System.out.println(i);
			}
		}
         
         
         int count = 0;
         for (int i = 100; i < 1000; i++) {//实现100-999的遍历
 		    int j1 =i/100;//百位
 			int j2 =(i-j1*100)/10;//十位
 			int j3 =i%10;//取膜
 			if(i==j1*j1*j1+j2*j2*j2+j3*j3*j3){
 				
				count++;
 			}
			
 		}
         System.out.println("count:"+count);
         
         
         
         
	}

}
