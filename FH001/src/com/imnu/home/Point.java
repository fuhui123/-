package com.imnu.home;
public class Point implements Comparable<Point>{
	//���ж���Ƚϣ�ʵ��Comparable�ӿ�
	//�˽ӿ�ǿ�ж�ʵ������ÿ����Ķ��������������
int x,y;//�����������ԣ���ʾ����
public Point(){
	//�޲ι���
}
public Point(int x,int y){
	//�вι���
	this.x=x;
	this.y=y;
}
	//get��set����
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
	//��д�ӿڵķ�������Ȼ�ȽϷ���
	//�Ƚϴ˶����ָ�������˳��
	//����ΪҪ�ȽϵĶ���
	//
@Override
public int compareTo(Point p) {
	//���ָ������󣬷��ظ�������֮����������������򷵻�0
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
  //��չ�����ָ����������Ͳ���������˶�����бȽϣ����׳���ClassCastException 
}

	


