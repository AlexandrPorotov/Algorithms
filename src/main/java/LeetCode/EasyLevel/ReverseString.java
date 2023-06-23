package LeetCode.EasyLevel;

//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[] {'h','e','l','l','o'});
    }
    public void reverseString(char[] s) {

        StringBuilder builder = new StringBuilder();
        char[] chars = builder.append(s).reverse().toString().toCharArray();

        for(int i = 0; i <= s.length-1; i++){
            s[i] = chars[i];
        }

        System.out.println(s);

    }

}
