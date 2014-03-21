package beginning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 描述
     请判断一个数是不是水仙花数。
     其中水仙花数定义各个位数立方和等于它本身的三位数。
     输入
     有多组测试数据，每组测试数据以包含一个整数n(100<=n<1000)
     输入0表示程序输入结束。
     输出
     如果n是水仙花数就输出Yes
     否则输出No
     样例输入
     153
     154
     0
     样例输出
     Yes
     No
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-17
 * Time: 下午4:25
 * To change this template use File | Settings | File Templates.
 */
public class FlowerNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> values = new ArrayList<String>();
        while(!input.equals("0")) {
            values.add(input);
            input = scanner.nextLine();
        }

        for (String value:values) {
            int sum = 0;
            for (int i = 0; i < value.length(); i ++) {
                sum += Math.pow(Integer.valueOf(String.valueOf(value.charAt(i))), 3);
            }

            if (sum == Integer.valueOf(value).intValue()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
