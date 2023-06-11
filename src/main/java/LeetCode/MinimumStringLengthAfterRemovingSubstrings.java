package LeetCode;


//Minimum String Length After Removing Substrings
//You are given a string s consisting only of uppercase English letters.
//
//You can apply some operations to this string where, in one operation, you can remove any occurrence
// of one of the substrings "AB" or "CD" from s.
//
//Return the minimum possible length of the resulting string that you can obtain.
//
//Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.


import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {

//    public int minLength(String s) {
//
//        int result = 0;
//
//        while (s.contains("AB") || s.contains("CD")) {
//            s = s.replaceAll("AB", "");
//            s = s.replaceAll("CD", "");
//        }
//        result = s.length();
//
//        return result;
//    }

    //Use stack. For every element in string just check if stack top is matched to current character of
    // string or not. If yes, then remove the element from stack, else push the character to the stack.
    //At Last return stack size.
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(!st.isEmpty()&&((s.charAt(i)=='B'&&st.peek()=='A')||(s.charAt(i)=='D'&&st.peek()=='C')))
            {
                st.pop();
            }
            else
                st.push(s.charAt(i));
        }
        return st.size();
    }
}
