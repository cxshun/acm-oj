package beginning;

import java.util.Scanner;

/**
 * 描述
     设计一个从5个整数中取最小数和最大数的程序
     输入
     输入只有一组测试数据，为五个不大于1万的正整数
     输出
     输出两个数，第一个为这五个数中的最小值，第二个为这五个数中的最大值，两个数字以空格格开。
     样例输入
     1 2 3 4 5
     样例输出
     1 5
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-20
 * Time: 下午5:08
 * To change this template use File | Settings | File Templates.
 */
public class TopValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[5];
        for (int i = 0; i < values.length; i ++) {
            values[i] = scanner.nextInt();
        }

        int min = values[0],max = values[0];
        for (int i = 0; i < values.length; i ++) {

            if (values[i] > max) {
                max = values[i];
            }

            if (values[i] < min) {
                min = values[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
