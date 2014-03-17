package words;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: shun
 * Date: 14-3-15
 * Time: 下午2:12
 * To change this template use File | Settings | File Templates.
 */
public class ReversePolishAnnotation {

    public static void main(String[] args) {

        String[] tokens = new String[]{"18"};
        int result = evalRPN(tokens);
        System.out.println("结果:" + result);
    }

    public static int evalRPN(String[] tokens) {
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();
        int result = 0;

        if (tokens.length == 1) {
            result = Integer.valueOf(tokens[0]);
        } else {
            for (String token:tokens) {
                String existedOperator = sb.toString();
                if (token.matches("[+-]?[0-9]+")) {
                    stack.push(token);
                } else {
                    int val2 = Integer.valueOf(stack.pop().toString());
                    int val1 = Integer.valueOf(stack.pop().toString());

                    char operator = token.charAt(0);
                    sb = new StringBuilder();
                    sb.append("(").append("" + (existedOperator.equals("") ? val1 : existedOperator) +
                            " " + operator + " " + val2).append(")");
                    switch (operator) {
                        case '*':
                            result = val1 * val2;
                            break;
                        case '+':
                            result = val1 + val2;
                            break;
                        case '-':
                            result = val1 - val2;
                            break;
                        case '/':
                            if (val2 != 0) {
                                result = val1 / val2;
                            }
                            break;
                        case '%':
                            if (val2 != 0) {
                                result = val1 % val2;
                            }
                            break;
                    }
                    stack.push(result);
                }
            }
            System.out.println("test code:" + sb.toString());
        }
        return result;
    }

}
