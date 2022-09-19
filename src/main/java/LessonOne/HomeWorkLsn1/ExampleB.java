package LessonOne.HomeWorkLsn1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Условие задачи:
//https://contest.yandex.ru/contest/27393/problems/B/

//Входные данные:
// a b c - три целых числа (стороны треугольника)

public class ExampleB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(foo(a,b,c));

    }

    public static String foo(int a, int b, int c){

        List<Integer> sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);

        List<Integer> sortedSides = sides.stream().sorted().collect(Collectors.toList());

        String result = "NO";

        if(a > 0 && b > 0 && c > 0) {
            if (sortedSides.get(2) < (sortedSides.get(0) + sortedSides.get(1))) {
                result = "YES";
            }
        }

        return result;
    }

}
