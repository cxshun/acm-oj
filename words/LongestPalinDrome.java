import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-14
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class LongestPalinDrome {

    public static void main(String[] args) {

        String str = "bbbb";


        String result = "";
        if (str.length() >= 1) {
            long startTime = System.currentTimeMillis();
            result = getLongestPalinDrome(str);
            long endTime = System.currentTimeMillis();
            System.out.println("Cost time:" + (endTime - startTime));
        }
        System.out.println("result:" + result);
    }

    private static final String getLongestPalinDrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        String longestPalinDrome = s.substring(0, 1);
        //do some recursive to get the substring
        String tmp = "";
        for (int i = 0; i < s.length(); i ++) {
            tmp = getHalfString(s, i, i);
            if (tmp.length() > longestPalinDrome.length()) {
                longestPalinDrome = tmp;
            }

            tmp = getHalfString(s, i, i + 1 );
            if (tmp.length() > longestPalinDrome.length()) {
                longestPalinDrome = tmp;
            }
        }

        return longestPalinDrome;
    }

    private static String getHalfString(String str, int start, int end) {
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start --;
            end ++;
        }
        return str.substring(start + 1, end);
    }

}
