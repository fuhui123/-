package com.liexi;

public class chunxiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = new char[4][];
		arr[0] =new char[]{'春','眠','不','觉','晓'};
		arr[1] =new char[]{'处','处','闻','啼','鸟'};
		arr[0] =new char[]{'夜','来','风','雨','声'};
		arr[0] =new char[]{'花','落','知','多','少'};
		System.out.println("横向");
		for(int i =0;i<4; i++){
			for(int j =0;j<5; j++ ){
				System.out.print(arr[i][j]);
			}
			if(i%2==0){
				System.out.println(",");
				
			}
			else{
				System.out.println("。");
			}
		}
		
	}

}
