package beginning;

import java.util.Scanner;
import java.util.Stack;

/**
 * 描述
     现在，有一行括号序列，请你检查这行括号是否配对。
     输入
     第一行输入一个数N（0<N<=100）,表示有N组测试数据。后面的N行输入多组输入数据，每组输入数据都是一个字符串S(S的长度小于10000，且S不是空串），测试数据组数少于5组。数据保证S中只含有"[","]","(",")"四种字符
     输出
     每组输入数据的输出占一行，如果该字符串中所含的括号是配对的，则输出Yes,如果不配对则输出No
     样例输入
     3
     [(])
     (])
     ([[]()])
     样例输出
     No
     No
     Yes
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
                            if (stack.isEmpty() || '[' != stack.pop().toString().charAt(0)) {
                                resultArr[i] = "No";
                            }
                            break;
                        case ')':
                            if (stack.isEmpty() || '(' != stack.pop().toString().charAt(0)) {
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
