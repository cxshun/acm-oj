package beginning;

import java.util.Scanner;

/**
 * 描述
     输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符。
     输入
     第一行输入一个数N,表示有N组测试数据。后面的N行输入多组数据，每组输入数据都是占一行，有三个字符组成，之间无空格。
     输出
     对于每组输入数据，输出一行，字符中间用一个空格分开。
     样例输入
     3
     qwe
     asd
     zxc
     样例输出
     e q w
     a d s
     c x z
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-17
 * Time: 上午10:18
 * To change this template use File | Settings | File Templates.
 */
public class AsciiSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());
        String[] strArr = new String[count];
        for (int i = 0; i < count; i ++) {
            strArr[i] = scanner.nextLine();
        }

        for (String str:strArr) {
            if (str != null && !str.equals("")) {
                char[] charArr = new char[str.length()];
                int min = str.charAt(0);
                for (int i = 0; i < str.length(); i ++) {
                    if (min >= str.charAt(i)) {
                        min = str.charAt(i);
                        for (int j = charArr.length - 1; j >= 1; j --) {
                            charArr[j] = charArr[j - 1];
                        }
                        //the smallest value is in the first
                        charArr[0] = str.charAt(i);
                    } else {
                        boolean hasSmaller = false;
                        //check if the values in array has bigger than the current one,if existed,then move that one latter and so on
                        for (int j = 0; j < charArr.length; j ++) {
                            if (charArr[j] >= str.charAt(i)) {
                                //move the data latter
                                for (int k = charArr.length - 1; k >= j && k > 0; k --) {
                                    charArr[k] = charArr[k - 1];
                                }
                                charArr[j] = str.charAt(i);
                                hasSmaller = true;
                                break;
                            }
                        }

                        if (!hasSmaller) {
                            charArr[i] = str.charAt(i);
                        }
                    }
                }

                for (char ch:charArr) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
    }
}
