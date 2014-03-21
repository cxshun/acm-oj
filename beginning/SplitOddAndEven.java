package beginning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 描述
     有一个整型偶数n(2<= n <=10000),你要做的是：先把1到n中的所有奇数从小到大输出，再把所有的偶数从小到大输出。
     输入
     第一行有一个整数i（2<=i<30)表示有 i 组测试数据；
     每组有一个整型偶数n。
     输出
     第一行输出所有的奇数
     第二行输出所有的偶数
     样例输入
     2
     10
     14
     样例输出
     1 3 5 7 9
     2 4 6 8 10

     1 3 5 7 9 11 13
     2 4 6 8 10 12 14

 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-17
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
public class SplitOddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());

        int[] values = new int[count];
        for (int i = 0; i < count; i ++) {
            values[i] = Integer.valueOf(scanner.nextLine());
        }

        for (int value:values) {
            List<Integer> oddList = new ArrayList<Integer>();
            List<Integer> evenList = new ArrayList<Integer>();
            for (int i = 1; i <= value; i ++) {
                if (i % 2 == 0) {
                    oddList.add(i);
                } else if (i % 2 != 0) {
                    evenList.add(i);
                }
            }

            for (int even:evenList) {
                System.out.print(even + " ");
            }
            System.out.println();
            for (int odd:oddList) {
                System.out.print(odd + " ");
            }
            System.out.println();
        }
    }
}
