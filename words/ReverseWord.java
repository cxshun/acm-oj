import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-12
 * Time: 下午5:50
 * To change this template use File | Settings | File Templates.
 */
public class ReverseWord {

    public static void main(String[] args) {

        String words = "   a   b ";
        String[] wordArr = words.trim().split("\\s*");

        List<String> wordList = Arrays.asList(wordArr);

        StringBuilder sb = new StringBuilder();
        for (int i = wordList.size() - 1; i >= 0; i --) {
            sb.append(wordList.get(i));
            if (i != 0) {
                sb.append(" ");
            }
        }
        System.out.println("Result:" + sb.toString());
        System.out.println("Test result:" + sb.toString().equals("b a"));
    }

}
