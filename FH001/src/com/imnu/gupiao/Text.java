package com.imnu.gupiao;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��Ʊ���룺");
        String code = input.next();
		System.out.println("��Ʊ���֣�");
		String name = input.next();
		Stock stock = new Stock(code, name);
		System.out.println("��Ʊ�������̼ۣ�");
		stock.previousClosingPrice = input.nextDouble();
		  System.out.println("��Ʊ��ǰ�۸�");
		stock.currentPrice = input.nextDouble();
		System.out.println(stock.name + "��ǰ�仯�ٷֱȣ�: " + stock.changePercent() * 100 + "%");
		input.close();
	}

}
