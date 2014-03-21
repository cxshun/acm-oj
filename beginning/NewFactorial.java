package beginning;

import java.util.Scanner;

/**
 * 描述

     大家都知道阶乘这个概念，举个简单的例子：5！=1*2*3*4*5.现在我们引入一种新的阶乘概念，将原来的每个数相乘变为i不大于n的所有奇数相乘例如：5!!=1*3*5.现在明白现在这种阶乘的意思了吧！

     现在你的任务是求出1!!+2!!......+n!!的正确值(n<=20)

     输入
     第一行输入一个a(a<=20)，代表共有a组测试数据
     接下来a行各行输入一个n.
     输出
     各行输出结果一个整数R表示1!!+2!!......+n!!的正确值
     样例输入
     2
     3
     5
     样例输出
     5
     23
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-21
 * Time: 下午2:18
 * To change this template use File | Settings | File Templates.
 */
public class NewFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.valueOf(scanner.nextLine());
        int[] values = new int[count];
        for (int i = 0; i < values.length; i ++) {
            values[i] = Integer.valueOf(scanner.nextLine());
        }

        for (int i = 0; i < values.length; i ++) {
            int value = values[i];
            int totalSum = 0;
            for (int j = 1; j < value + 1; j ++) {
                int sum = 1;
                for (int k = 0; k < j + 1; k ++) {
                    if (k % 2 != 0) {
                        sum *= k;
                    }
                }
                totalSum += sum;
            }
            System.out.println(totalSum);
        }
    }
}
