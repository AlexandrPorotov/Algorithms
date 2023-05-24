package Contest;

import java.util.Scanner;

public class AplusB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        solution(getIntsFromConsole(scanner));

    }

    private static void solution(int[] arr){
        int a = arr[0];
        int b = arr[1];
        System.out.println(sum(a,b));
        System.out.println(multiplication(a,b));
    }

    private static int sum(int a, int b){
        return a+b;
    }

    private static int multiplication(int a, int b){
        return a*b;
    }

    private static int[] getIntsFromConsole(Scanner scanner){

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int[] result = new int[2];

        result[0] = Integer.parseInt(a);
        result[1] = Integer.parseInt(b);

        return result;
    }

}
