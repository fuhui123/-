package com.shijian;

import java.util.Scanner;

public class ShiJian17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner yue = new Scanner(System.in);
System.out.println("�������·ݣ�(1����12)");
int shu =yue.nextInt();
/*switch (shu) {
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
default:
	System.err.println("��������");
	break;
}
*/
if (shu==2||shu==12||shu==1) {
	System.out.println("����");
}
else if (shu==5||shu==4||shu==3) {
	System.out.println("����");
}
else if (shu==8||shu==7||shu==6) {
	System.out.println("����");
}
else if (shu==11||shu==10||shu==9) {
	System.out.println("����");
}
else {
	System.out.println("��������");
}






	}

}
