package wylearn.Array;

import java.util.Scanner;

/**
*Java 语言进阶  主讲人：翁恺    时间：2018/9/1
* 内容：数组
*
* 性质
* 数组是一种容器；
* 元素数据类型相同；
* 创建后不能改变大小
*
* 机制：最小的下标是0，最大的下标是数组的元素个数-1
*      编译器不会检查下标是否有效，即数组下标越界也不会当时就提示，运行后才提示
*      运行时出现无效的下标，会抛出异常：数组下标越界
*
* 定义数组变量：
* <类型>[] <名字> = new <类型>[元素个数];
* example：int[] grades = new int[100];
*          double[] averages = new double[20];
* 元素个数必须是整数
* 元素个数必须给出
* 元素个数可以是变量------>Array2
*
* 数组常用到的成员变量：length
*/

/**
 * 1.输入一串数字，找出大于平均值的数列
 * 2.数组的元素个数由用户输入
 */
public class Array2 {
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		// 功能：从键盘接收数据
		double sum = 0;
		int cnt = 0;
		cnt = in.nextInt();
		//用户先明确要输入多少个
		
		if (cnt > 0){
			int[] numbers = new int[cnt];
			//定义数组，创建cnt个长度的int类型数组
			for (int i = 0; i < cnt; i++){
				numbers[i] = in.nextInt();
				//将输入的x赋值数组中
				sum += numbers[i];
			}
			double average = sum/cnt;
			for (int i = 0; i < numbers.length; i++){
				/*
				*遍历数组
				*/
				if (numbers[i] > average){
					//使用数组的元素
					System.out.println(numbers[i]);
				}
			}
			System.out.println(sum/cnt);
		}
	}
}

