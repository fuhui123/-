package com.imnu.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CompareY {
	public static void main(String[] args) {
		Random r = new Random();    //����������Ķ���
		List<Point> list=new ArrayList<Point>(); //��������
		for(int i=0;i<100;i++){					 //�������100��Point���󣨲�ͬ�������������뼯����
			Point p=new Point(r.nextInt(50),r.nextInt(50));
			list.add(p);
		}
		Collections.sort(list);					 //��list��������
		for(Point p:list){						 //�����ж���Ľ������
			System.out.println(p.x+","+p.y);
		}
	
		
	}

}
