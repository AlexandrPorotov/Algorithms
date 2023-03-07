package Trenings01.LessonTwo.HomeWorkLsn2.DevisionB;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;

//Условие задачи: https://contest.yandex.ru/contest/28738/problems/
//Последовательность состоит из натуральных чисел и завершается числом 0.
// Всего вводится не более 10000 чисел. (не считая завершающего числа 0).
// Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
//Числа, следующие за числом 0, считывать не нужно.


public class ExACountMaxInts {

    private final static Logger logger = LoggerFactory.getLogger(ExACountMaxInts.class);

    public static void main(String[] args) {

        int[] array = getArrayFromConsole();
        ExACountMaxInts.go(array);

    }

    public static int[] getArrayFromConsole(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            sb.append(line);
        }
        String s = sb.toString();

        return Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static void go(int[] array){
        if(array != null) {
            System.out.println(countMaximums(array));
            logger.info("Program started");
        } else {
            logger.error("Input data has null");
        }
    }

    public static int findIndexMaxValue(int[] array){

        logger.info("findIndexMaxValue() started with param - " + Arrays.toString(array));

        int ans = array[0];
        int ansIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > ans){
                ans = array[i];
                ansIndex = i;
            }
        }

        logger.info("findIndexMaxValue() stop with max value = array[{}] : {}", ansIndex, ans);

        return ansIndex;

    }

    public static int countMaximums(int[] array){

        logger.info("countMaximums() started with param - " + Arrays.toString(array));

        int indexOfMaximumValue = findIndexMaxValue(array);
        int count = 0;

        for(int i : array) {
            if(i == array[indexOfMaximumValue]){
                count++;
            }
        }

        logger.info("countMaximums() stop, result = " + count);

        return count;
    }

}
