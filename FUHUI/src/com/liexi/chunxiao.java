package com.liexi;

public class chunxiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = new char[4][];
		arr[0] =new char[]{'��','��','��','��','��'};
		arr[1] =new char[]{'��','��','��','��','��'};
		arr[0] =new char[]{'ҹ','��','��','��','��'};
		arr[0] =new char[]{'��','��','֪','��','��'};
		System.out.println("����");
		for(int i =0;i<4; i++){
			for(int j =0;j<5; j++ ){
				System.out.print(arr[i][j]);
			}
			if(i%2==0){
				System.out.println(",");
				
			}
			else{
				System.out.println("��");
			}
		}
		
	}

}
