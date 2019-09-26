package com.imnu.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CompareY {
	public static void main(String[] args) {
		Random r = new Random();    //创建随机数的对象
		List<Point> list=new ArrayList<Point>(); //创建集合
		for(int i=0;i<100;i++){					 //随机创建100个Point对象（不同参数），并存入集合中
			Point p=new Point(r.nextInt(50),r.nextInt(50));
			list.add(p);
		}
		Collections.sort(list);					 //对list进行排序
		for(Point p:list){						 //将所有对象的结果遍历
			System.out.println(p.x+","+p.y);
		}
	
		
	}

}
