import java.util.*;

class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                }
                else {
                    ans++;
                }

                if (st.isEmpty()) {
                    ans++;
                }
                else {
                    st.pop();
                }
            }
        }

        return ans + st.size() * 2;
    }
}