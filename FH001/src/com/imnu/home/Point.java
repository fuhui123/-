package com.imnu.home;
public class Point implements Comparable<Point>{
	//进行对象比较，实现Comparable接口
	//此接口强行对实现它的每个类的对象进行整体排序
int x,y;//定义两个属性，表示坐标
public Point(){
	//无参构造
}
public Point(int x,int y){
	//有参构造
	this.x=x;
	this.y=y;
}
	//get，set方法
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
	//重写接口的方法（自然比较法）
	//比较此对象和指定对象的顺序
	//参数为要比较的对象
	//
@Override
public int compareTo(Point p) {
	//如果指定对象大，返回负数，反之，返回正数。相等则返回0
	if(y<p.y){
		return -1;
	}
	if(y>p.y){
		return 1;
	}
	if(y ==p.y){
		if(x<p.x){
			return -1;
		}
		if(x>p.x){
			return 1;
		}
	}
	return 0;
}
  //拓展：如果指定对象的类型不允许它与此对象进行比较，则抛出：ClassCastException 
}

	


