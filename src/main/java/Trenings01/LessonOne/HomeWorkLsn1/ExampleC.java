package Trenings01.LessonOne.HomeWorkLsn1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Условие задачи:
//https://contest.yandex.ru/contest/27393/problems/C/
public class ExampleC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] numbers = new String[3];

        String newNumber = scanner.nextLine();
        numbers[0] = scanner.nextLine();
        numbers[1] = scanner.nextLine();
        numbers[2] = scanner.nextLine();

        Arrays.stream(foo(newNumber,numbers)).forEach(System.out::println);

    }

    public static String[] foo(String newNumber, String[] numbers){

        String[] result = new String[]{"NO","NO","NO"};

        String[] equalNumber = numberHandler(newNumber);

        for(int i = 0; i < numbers.length; i++){
            String[] existNumber = numberHandler(numbers[i]);
            if( (equalNumber[0].equals(existNumber[0])) && (equalNumber[1].equals(existNumber[1])) ){
                result[i] = "YES";
            }
        }

        return result;

    }

    public static String[] numberHandler(String number){

        String[] result = new String[]{"000","0000000"};
        String[] splitNumber = number.split("");

        List<String> buffer = new ArrayList<>();

        for(String s : splitNumber){

            if(!(s.equals("+") || s.equals("-") || s.equals("(") || s.equals(")"))) {
                buffer.add(s);
            }

        }

        if(buffer.size() == 7){
            List<String> code = Arrays.asList("4","9","5");
            buffer.addAll(0,code);
        }

        if(buffer.get(0).equals("8") || buffer.get(0).equals("7")) {

            buffer.remove(0);

        }

        result[0] = String.join("", buffer.subList(0,3));
        result[1] = String.join("",buffer.subList(3,buffer.size()));

        return result;

    }
}
