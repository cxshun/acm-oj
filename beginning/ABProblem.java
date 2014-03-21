package beginning;

import java.util.Scanner;

/**
 *   描述
     此题为练手用题，请大家计算一下a+b的值
     输入
     输入两个数，a,b
     输出
     输出a+b的值
     样例输入
     2 3
     样例输出
     5
 * Created by chenxiaoshun on 14-3-16.
 */
public class ABProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
    }
}
