package com.shijian;
/**
 * ��������ˮ�ɻ�������νˮ�ɻ���ָһ����λ��������λ�����������͵����䱾��
 * ����153=1*1*1+5*5*5+3*3*3
 * */
public class ShiJian3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for (int i = 100; i < 1000; i++) {//ʵ��100-999�ı���
		    int j1 =i/100;//��λ
			int j2 =(i-j1*100)/10;//ʮλ
			int j3 =i%10;//ȡĤ
			if(i==j1*j1*j1+j2*j2*j2+j3*j3*j3){
				System.out.println(i);
			}
		}
         
         
         int count = 0;
         for (int i = 100; i < 1000; i++) {//ʵ��100-999�ı���
 		    int j1 =i/100;//��λ
 			int j2 =(i-j1*100)/10;//ʮλ
 			int j3 =i%10;//ȡĤ
 			if(i==j1*j1*j1+j2*j2*j2+j3*j3*j3){
 				
				count++;
 			}
			
 		}
         System.out.println("count:"+count);
         
         
         
         
	}

}
