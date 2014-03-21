package beginning;

import java.util.Scanner;

/**
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
