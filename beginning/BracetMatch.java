package beginning;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by chenxiaoshun on 14-3-16.
 */
public class BracetMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());
        String[] strArr = new String[count];
        String[] resultArr = new String[count];
        for (int i = 0; i < count; i ++) {
            strArr[i] = scanner.nextLine();
        }

        Stack stack = new Stack();
        for (int i = 0; i < count; i ++) {
            resultArr[i] = "";
            stack.clear();
            if (strArr != null) {
                for (int j = 0; j < strArr[i].length(); j ++) {
                    switch (strArr[i].charAt(j)) {
                        case ']':
                            if (stack.isEmpty() || '[' != stack.pop()) {
                                resultArr[i] = "No";
                            }
                            break;
                        case ')':
                            if (stack.isEmpty() || '(' != stack.pop()) {
                                resultArr[i] = "No";
                            }
                            break;
                        default:
                            stack.push(strArr[i].charAt(j));
                    }

                    if (resultArr[i].equals("No")) {
                        break;
                    }
                }
            }

            if (resultArr[i].equals("")) {
                resultArr[i] = "Yes";
            }
        }

        for (String result:resultArr) {
            System.out.println(result);
        }
    }
}
