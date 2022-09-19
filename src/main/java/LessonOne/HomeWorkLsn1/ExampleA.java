package LessonOne.HomeWorkLsn1;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleA {

    //Условие задачи:
    //https://contest.yandex.ru/contest/27393/problems/A/

    //Входные данные:
    //20 30 (Температура в комнате и желаемая соответственно)
    //mode (режим - freeze/heat/auto/fan)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputTemperature = scanner.nextLine();
        String mode = scanner.nextLine();

        int[] temperature = Arrays.stream(inputTemperature.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(foo(temperature,mode));

    }

    public static int foo(int[] temperature, String mode){

        int result = 0;
        switch (mode){
            case "freeze":
                if(temperature[0] <= temperature[1]) {
                    result = temperature[0];
                } else {
                    result = temperature[1];
                }
                break;
            case "heat":
                if(temperature[0] >= temperature[1]){
                    result = temperature[0];
                } else {
                    result = temperature[1];
                }
                break;
            case "auto":
                result = temperature[1];
                break;
            case "fan":
                result = temperature[0];
                break;

        }
        return result;
    }

}
