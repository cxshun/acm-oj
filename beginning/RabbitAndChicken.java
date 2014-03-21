package beginning;

import java.util.Scanner;

/**
 * 描述
     已知鸡和兔的总数量为n,总腿数为m。输入n和m,依次输出鸡和兔的数目，如果无解，则输出“No answer”(不要引号)。
     输入
     第一行输入一个数据a,代表接下来共有几组数据，在接下来的(a<10)
     a行里，每行都有一个n和m.(0<m,n<100)
     输出
     输出鸡兔的个数，或者No answer
     样例输入
     2
     14 32
     10 16
     样例输出
     12 2
     No answer
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-18
 * Time: 上午10:29
 * To change this template use File | Settings | File Templates.
 */
public class RabbitAndChicken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());

        String[] strArr = new String[count];
        for (int i = 0; i < count; i ++) {
            strArr[i] = scanner.nextLine();
        }

        for (String str:strArr) {
            int totalCount = Integer.valueOf(str.split(" ")[0]);
            int totalFootCount = Integer.valueOf(str.split(" ")[1]);

            if ((totalFootCount - 2 * totalCount) >= 0) {
                int rabbitCount = (totalFootCount - 2 * totalCount) / 2;
                if ((totalFootCount - 2 * totalCount) % 2 != 0) {
                    System.out.println("No answer");
                    continue;
                }

                if (totalCount < rabbitCount) {
                    System.out.println("No answer");
                    continue;
                }
                int chickenCount = totalCount - rabbitCount;

                System.out.println(chickenCount + " " + rabbitCount);
            } else {
                System.out.println("No answer");
            }
        }
    }
}
