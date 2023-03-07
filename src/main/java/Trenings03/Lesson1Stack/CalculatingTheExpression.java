package Trenings03.Lesson1Stack;

//Вычисление выражений вида (а+b)/2*3 и т д
//Преобразование из инфиксной в постфиксную запись
//ограничения, числа не больше 10

import java.nio.charset.CharsetEncoder;
import java.util.*;

public class CalculatingTheExpression {

    private static final Map<Character,Integer> priorityMap = Map.of(
            '*',2,
            '/',2,
            '+',1,
            '-',1);

    private static Stack<Character> stack;

    public static void main(String[] args) {
        //пример
        List<String> input = Arrays.asList("8*(9+3-2*2)*(7+4-9)/2","(3+4)*9+8*(7-2)","6/3+5-2-(6-1)","6+3*(1+4*5)*2","1+3/3+1*(5*2/5)");

        for(String s : input){
            System.out.println(s + " = " + calculations(s));
        }

    }

    public static String converterToPostfix(String inputExpression){

        StringBuilder result = new StringBuilder();

        stack = new Stack<>();

        for(Character c : inputExpression.toCharArray()){

            if (Character.isDigit(c)) {
                result.append(c);
            } else {
                if(stack.empty()){
                    stack.add(c);
                } else if (c.equals('(')) {
                    stack.add(c);
                } else if (c.equals((')'))){
                    while (!stack.peek().equals('(')) {
                        result.append(stack.peek());
                        stack.pop();
                    }
                    stack.pop();
                } else if (checkPriority(c, stack.peek())) {
                    while (checkPriority(c, stack.peek())) {
                        result.append(stack.peek());
                        stack.pop();
                        if(stack.empty()){break;}
                    }
                    stack.add(c);
                } else {
                    stack.add(c);
                }
            }

        }
        while (!stack.empty()) {
            result.append(stack.peek());
            stack.pop();
        }


        return result.toString();

    }

    public static boolean checkPriority(Character operatorFromExpression, Character operatorFromStack) {
        boolean result = false;

        if(!operatorFromStack.equals('(')) {
            int priorityOperatorFromExpression = priorityMap.get(operatorFromExpression);
            int priorityOperatorFromStack = priorityMap.get(operatorFromStack);
            result = priorityOperatorFromExpression <= priorityOperatorFromStack;
        }

        return result;

    }

    public static Integer calculations(String inputExpression){

        String postfix = converterToPostfix(inputExpression);

        Stack<Integer> result = new Stack<>();

        //63145*+*2*+

        for(Character ch : postfix.toCharArray()){

            if(Character.isDigit(ch)){
                Integer a = Integer.parseInt(ch.toString());
                result.add(a);
            } else {
                Integer a = result.peek();
                result.pop();
                Integer b = result.peek();
                result.pop();
                result.add(makeOperation(b,a,ch));
            }
        }


       return result.peek();
    }

    public static Integer makeOperation(Integer a, Integer b, Character operator){
        int result = 0;

        switch (operator) {
            case ('+') -> {
                result = a + b;
                return result;
            }
            case ('-') -> {
                result = a - b;
                return result;
            }
            case ('/') -> {
                result = a / b;
                return result;
            }
            case ('*') -> {
                result = a * b;
                return result;
            }
        }

        return result;
    }

    public static List<String> convertExpressionToStringArray(String inputExpression){

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < inputExpression.length();  i++) {
            char ch = inputExpression.charAt(i);
            if (Character.isDigit(ch)) {
                int j = i;
                while (j < inputExpression.length() && Character.isDigit(inputExpression.charAt(j))) {
                    j++;
                }
                arr.add(inputExpression.substring(i, j));
                i = j - 1;
            } else {
                arr.add(Character.toString(ch));
            }

        }
        return arr;
    }
}
