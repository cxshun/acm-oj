/**
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-14
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class LongestPalinDrome {

    public static void main(String[] args) {

        String str = "lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqc" +
                "dhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrd" +
                "gwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmluss" +
                "pqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasn" +
                "hrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywv" +
                "khargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdr" +
                "rgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkva" +
                "erljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpd" +
                "nswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfklt" +
                "vplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjw" +
                "uogdyzvanalohmzrywdwqqcukjceothydlgtocukc";
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
        if (s.length() <= 1) {
            return "";
        }

        String longestPalinDromeStr = "";
        char[] tmpChar = null;
        //do some recursive to get the substring
        for (int i = 0; i < s.length(); i ++) {
            for (int j = s.length() - 1; j >= i; j --) {
                tmpChar = s.substring(i, j + 1).toCharArray();
                for (int k = 0,l = tmpChar.length - 1; k < tmpChar.length && k <= l; k ++, l --) {
                    if (k <= l) {
                        if (tmpChar[k] == tmpChar[l]) {
                            continue;
                        }
                        //if not equals then break
                        tmpChar = new char[0];
                        break;
                    }
                }
                if (longestPalinDromeStr.length() <= tmpChar.length) {
                    longestPalinDromeStr = new String(tmpChar);
                }
            }
        }
        return longestPalinDromeStr;
    }

}
