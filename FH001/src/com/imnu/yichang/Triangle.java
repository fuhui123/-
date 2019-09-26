package com.imnu.yichang;
import java.util.Scanner;
public class Triangle {


	/**
	 * 
	 * 定义Triangle类用于表示三角形，其任意两个边的和必须大于第三条边。定义IllegalTriangleException用于声明违反以上规则的输入，并测试你的异常类。提示：Triangle类的构造方法
	 * 如下：
	 * 	public triangle(double side1, double side2, double side3)throws lllegaltriangleException{}
	 *
	 */
	
		//先初始化一个数组用以辅助捕获异常
		static String[] biaoshis = new String[]{"no"};
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//创建异常对象
			new IllegalArgumentException();
			int side1 = 0;
			int side2 = 0;
			int side3 = 0;
			//捕获数据匹配异常
			try {
				//键盘录入数据
				System.out.println("请输入第一条边的边长：");
				side1 = sc.nextInt();
				System.out.println("请输入第二条边的边长：");
				side2 = sc.nextInt();
				System.out.println("请输入第三条边的边长：");
				side3 = sc.nextInt();
				//捕获三角形不合法的异常
				try {
					//调用方法判断数据是否合法
					test(triangle(side1, side2, side3));
				} catch (IllegalTringleException e1) {
					e1.printStackTrace();
				} catch (Exception e2){
					System.out.println("此三角形不成立！");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("必须输入数字！！！");
			}
			try {
				if (triangle(side1, side2, side3).equals("yes")) {
					System.out.println("此三角形成立！");
				}
			} catch (IllegalTringleException e) {
				// TODO Auto-generated catch block
			}
		}

		//判断三角形是否合法
		public static String triangle(int side1, int side2, int side3)throws IllegalTringleException{
			if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
				return "yes";
			}else{
				return "no";
			}
		}
		
		//辅助捕获三角形不合法的异常
		public static void test(String biaoshi) throws IllegalTringleException{
			for (String bs : biaoshis){
				if (bs.equals(biaoshi)) {
					throw new IllegalTringleException("此三角形不成立！");
				}
			}
		}
	}

	//自定义异常类型IllegalTringleException
	class IllegalTringleException extends Exception {
		static final long serialVersionUID = 94551659454L;
		public IllegalTringleException(){
			super();
		}
		public IllegalTringleException(String message, Throwable cause){
			super(message, cause);
		}
		public IllegalTringleException(String message){
			super(message);
		}
	}



	


	