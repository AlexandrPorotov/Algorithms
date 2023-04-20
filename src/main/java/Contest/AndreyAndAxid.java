package Contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class AndreyAndAxid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine(); //кол-во резервуаров
        int s = Integer.parseInt(num);
        String volume = scanner.nextLine();
        int[] arr = Arrays.stream(volume.split(" ")).mapToInt(Integer::parseInt).toArray(); //объем в резервуарах

        solution(s,arr);
    }

    private static void solution(int n, int[] array) {

        int max = array[0];
        int min = array[0];
        int answer = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
            if (array[i] < max) {
                answer = -1;
                break;
            }
        }

        if (answer == 0) {
            System.out.println(max - min);
        } else System.out.println("answer" + answer);

    }
}
