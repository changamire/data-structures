package problems;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {

    public static void main(String args[]) {

        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseSentence("The quick brown dog"));
    }

    public String reverseSentence(String input) {
        StringTokenizer st = new StringTokenizer(input," ");
        StringBuffer sb = new StringBuffer();
        Stack s = new Stack();
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            System.out.println(str);
            s.push(str);
        }
        while (!s.empty()) {
            sb.append(s.pop() + " ");
        }
        return sb.toString();
    }
}
