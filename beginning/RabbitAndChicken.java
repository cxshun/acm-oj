package beginning;

import java.util.Scanner;

/**
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
