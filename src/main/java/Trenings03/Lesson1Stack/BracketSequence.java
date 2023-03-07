package Trenings03.Lesson1Stack;

import java.util.Stack;

//Задача Скобочная последовательность
//нужно проверять что в последовательности скобок, они все закрыты согласно мат. правилам
public class BracketSequence {

    public static void main(String[] args) {

    }

    //решение на основе баланса
    //работает только для последовательности из "(" и ")"
    public static boolean checkSimpleSequence(String sequence){

        int balance = 0;
        for(char c : sequence.toCharArray()){
            if(c == '('){
                balance++;
            } else {
                balance--;
            }
        }

        return balance == 0;
    }

    //решение на основе стека
    //работает с разными видами скобок (для примера взял "{ [ (" )
    public static boolean checkSequence(String sequence){

        Stack<Character> stack = new Stack<>();

        for(Character c : sequence.toCharArray()){
            if (c == '{' || c == '[' || c == '(') {
                stack.add(c);
            }else if (c == '}' && stack.peek() == '{'){
                stack.pop();
            }else if (c == ']' && stack.peek() == '['){
                stack.pop();
            }else if (c == ')' && stack.peek() == '('){
                stack.pop();
            }else if (stack.empty()){
                break;
            }
        }
        return stack.empty();
    }
}
