package beginning;

import java.util.Scanner;

/**
 * 描述
     相传韩信才智过人，从不直接清点自己军队的人数，只要让士兵先后以三人一排、五人一排、七人一排地变换队形，而他每次只掠一眼队伍的排尾就知道总人数了。输入3个非负整数a,b,c ，表示每种队形排尾的人数（a<3,b<5,c<7），输出总人数的最小值（或报告无解）。已知总人数不小于10，不超过100 。
     输入
     输入3个非负整数a,b,c ，表示每种队形排尾的人数（a<3,b<5,c<7）。例如,输入：2 4 5
     输出
     输出总人数的最小值（或报告无解，即输出No answer）。实例，输出：89
     样例输入
     2 1 6
     样例输出
     41
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-25
 * Time: 下午4:55
 * To change this template use File | Settings | File Templates.
 */
public class HanxinCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        boolean hasResult = false;
        int result = 0;
        for (int i = 0; i < 100; i ++) {
            if (((i - Integer.valueOf(values[0])) % 3) == 0
                    && ((i - Integer.valueOf(values[1])) % 5) == 0
                    && ((i - Integer.valueOf(values[2])) % 7) == 0) {
                hasResult = true;
                result = i;
            }
        }

        if (hasResult) {
            System.out.println(result);
        } else {
            System.out.println("No answer");
        }
    }
}
