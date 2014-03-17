package beginning;

import java.util.Scanner;

/**
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
