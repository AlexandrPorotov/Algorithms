package LeetCode;

public class PalindromeNumber {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {

        StringBuilder builder = new StringBuilder();
        String a = builder.append(x).toString();
        String b = builder.reverse().toString();

        return a.equals(b);
    }
}
