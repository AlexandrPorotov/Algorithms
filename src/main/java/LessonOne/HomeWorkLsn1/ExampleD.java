package LessonOne.HomeWorkLsn1;

import java.util.Scanner;

//Условие задачи:
//https://contest.yandex.ru/contest/27393/problems/D/
public class ExampleD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(foo(a,b,c));

    }

    public static String foo(int a, int b, int c){

        String result = "";

        if(c<0 || (a == 0 && ((c*c)-b) != 0)) {
            result = "NO SOLUTION";
        } else if (a==0 && (c*c) == b) {
            result = "MANY SOLUTIONS";
        } else if ( (((c*c)-b) % a ) == 0) {
            int x  = ((c*c)-b)/a;
            result = "" + x;
        }

        /*(a == 0){
            result = "NO SOLUTION";
            if(b == 0 && c == 0){
                result = "MANY SOLUTIONS";
            }
        } else if( c < 0 ){
            result = "NO SOLUTION";
        } else {

            int x  = ((c*c)-b)/a;
            result = "" + x;

        }*/

        return result;

    }
}
