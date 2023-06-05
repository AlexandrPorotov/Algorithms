package LeetCode;


import java.util.Arrays;
import java.util.Stack;

//Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
public class RemoveTrailingZerosFromAString {

//    public String removeTrailingZeros(String num) {
//
//        Stack<String> stack = new Stack<>();
//
//        stack.addAll(Arrays.asList(num.split("")));
//
//        String number = stack.peek();
//        StringBuilder result = new StringBuilder();
//
//        while (number.equals("0")){
//            stack.pop();
//            number = stack.peek();
//        }
//
//        for (String s : stack){
//            result.append(s);
//        }
//
//        return result.toString();
//    }

    public String removeTrailingZeros(String num) {
        int count=0;
        int size=num.length()-1;
        while(true){
            if(num.charAt(size)=='0'){
                count++;
                size--;
            }else{
                break;
            }
        }
        return num.substring(0,(num.length()-count));
    }
}
