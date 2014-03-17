package beginning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
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
