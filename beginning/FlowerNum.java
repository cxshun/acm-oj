package beginning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
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
