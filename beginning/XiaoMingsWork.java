package beginning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chenxiaoshun on 14-3-24.
 */
public class XiaoMingsWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());

        String[] strArr = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for (String str:strArr) {
            if (!list.contains(Integer.valueOf(str))) {
                boolean isLarger = true;
                for (int i = 0; i < list.size(); i ++) {
                    if (Integer.valueOf(str) < list.get(i)) {
                        list.add(i, Integer.valueOf(str));
                        isLarger = false;
                        break;
                    }
                }

                if (isLarger) {
                    list.add(Integer.valueOf(str));
                }
            }
        }

        System.out.println(list.size());
        for (int value:list) {
            System.out.print(value + " ");
        }
    }
}
