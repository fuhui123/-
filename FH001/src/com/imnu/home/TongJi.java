package com.imnu.home;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TongJi {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>(); 	//�������϶���
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ��������֣���0Ϊֹ����");
		while(true){							//ͨ��ѭ�����������Ԫ�أ���0������ѭ��
			int num=sc.nextInt();				
			list1.add(num);
			if(num==0){
				break;
			}
		}
		Object[] arr=list1.toArray();			//��list1�е�Ԫ�ش���arr����
		Set<Object> s=new HashSet<Object>();	//HashSet����ȥ���ظ���Ԫ��
		for (Object o : arr) {  				//�������е�Ԫ�ط��뼯��s��
		       s.add(o);  
		    } 									// ���ڵļ���s�����ظ��İ���arr�е�����Ԫ��  
	    Object[] obj = s.toArray();			// �Ѽ���s�е�Ԫ�ش�������obj�У���obj��Ԫ����arr�����ظ�������Ԫ��  
	    int[] n = new int[obj.length];		// ��������������ÿһ��Ԫ�س��ֵĴ���  
	    int max = 0;      					// ������������
	    for (int i = 0; i < obj.length; i++) {  
	       int count = 0;  					//��¼������ÿ��Ԫ�صĳ��ִ����ļ�������ÿ��ѭ������һ��
	       for (int j = 0; j < arr.length; j++) {  
	           if (obj[i].equals(arr[j]))  	//�����ȥ���ظ�Ԫ�ص������ԭ�����е�Ԫ����һ�Ƚ�
	              count++;  				//�����ͬ��count������1�����countΪ��Ԫ�س��ֵĴ���
	       }  
	       n[i] = count;					// ÿһ��Ԫ�س��ֵĴ�����������n  
	                  						// ����n���±�i������obj���±���һһ��Ӧ�ģ�����һ��  
	       if (max < count) {				// �����Ԫ�صĴ�����Ŀǰ�������࣬�����������
	           max = count;  
	       }  
	    }  
	    for (int i = 0; i < n.length; i++) {// ���������Ԫ�ش��������� 
	       if (max == n[i]) {  
			// ������ֵĴ������������������������obj�ж�Ӧ��������Ԫ�أ���Ϊ����һ��  
	           System.out.println("�������ǣ�"+obj[i]+"\t "+"��"+n[i]+"��");  
	       }  
	    }  
	  
	
	}
	}

