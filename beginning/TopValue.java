package beginning;

import java.util.Scanner;

/**
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
