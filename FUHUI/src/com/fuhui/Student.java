package com.fuhui;
	/*
	 * ѧ����
	 * 
	 * ͨ������ֱ�ӷ��ʳ�Ա��������������ݰ�ȫ����
	 * ���ʱ�����Ǿ����ܲ��ܲ������Ķ���ֱ�ӷ��ʳ�Ա������?
	 * �ܡ�
	 * ���ʵ����?
	 * 		private�ؼ���
	 * private:
	 * 		��һ�����η�
	 * 		�������γ�Ա������Ҳ�������γ�Ա����
	 * 		��private���εĳ�Աֻ���ڱ����б�����
	 * 
	 * ���private���εĳ�Ա���������ǻ���Ӧ���ṩgetXxx()��setXxx()���ڻ�ȡ�����ó�Ա������ֵ,������public����
	 */
	public class Student {
		String name;
		//int age;
		private int age;
		
		public void setAge(int a) {
			if(a<0 || a>200) {
				System.out.println("�������������");
			}else {
				age = a;
			}
		}
		
		public int getAge() {
			return age;
		}
		
		public void show() {
			System.out.println("�����ǣ�"+name+",�����ǣ�"+age);
		} 
	}


	
	
