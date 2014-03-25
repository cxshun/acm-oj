package beginning;

import java.util.Scanner;

/**
 * 描述
     N！阶乘是一个非常大的数，大家都知道计算公式是N!=N*(N-1）······*2*1.现在你的任务是计算出N！的位数有多少（十进制）？

     输入
     首行输入n，表示有多少组测试数据(n<10)
     随后n行每行输入一组测试数据 N( 0 < N < 1000000 )
     输出
     对于每个数N，输出N!的（十进制）位数。
     样例输入
     3
     1
     3
     32000
     样例输出
     1
     1
     130271
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-25
 * Time: 下午3:37
 * To change this template use File | Settings | File Templates.
 */
public class LengthOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.valueOf(scanner.nextLine());
        String[] values = new String[count];
        for (int i = 0; i < count; i ++) {
            values[i] = scanner.nextLine();
        }

        for (String value:values) {
            double sum = 0;
            for (int i = 1; i <= Integer.valueOf(value); i ++) {
                sum += Math.log10(i);
            }
            System.out.println((int)sum + 1);
        }
    }
}
