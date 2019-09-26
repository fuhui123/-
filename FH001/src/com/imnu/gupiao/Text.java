package com.imnu.gupiao;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("股票代码：");
        String code = input.next();
		System.out.println("股票名字：");
		String name = input.next();
		Stock stock = new Stock(code, name);
		System.out.println("股票昨日收盘价：");
		stock.previousClosingPrice = input.nextDouble();
		  System.out.println("股票当前价格：");
		stock.currentPrice = input.nextDouble();
		System.out.println(stock.name + "当前变化百分比：: " + stock.changePercent() * 100 + "%");
		input.close();
	}

}
