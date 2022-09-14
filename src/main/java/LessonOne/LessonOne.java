package LessonOne;


import java.util.*;
import java.util.stream.Collectors;

public class LessonOne {

    public static void main(String[] args) {

        /*Задача:
	Дана строка (в кодировке UTF-8)
    Найти самый часто встречающийся в ней символ.
    Если несколько символов встречаются в ней одинаков часто, то можно вывести любой.
    Строка ababa
    */

        /*Решение в лоб - цикл в цикле*/

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String ans = ""; //строка с результатом, пока что пустая
        int ansCnt = 0; //счетчик букв (повторений), пока что пустой


        //(2ое решение)
        //Убираем из входящей строки все повторяющиеся значения (тем самым уменьшаем кол-во проходов первого массива)
        List<String> inputClear = Arrays.stream(input.split("")).distinct().collect(Collectors.toList());

        System.out.println(inputClear);

        for(String i : inputClear){ //идем по всей строке
            int nowCnt = 0; //сколько раз встретилась буква
            for(String k : input.split("")) {
                if (i.equals(k)){
                    nowCnt++;
                }
            }
            if(ansCnt < nowCnt){ /*если после прохода мы получили результат лучше, чем был до этого
                    перезаписываем его*/
                ans = i;
                ansCnt = nowCnt;
            }
        }
        System.out.println(ans + " " + ansCnt);


        System.out.println("Третье решение --");
        threeExp(input);
        sqrNum(1,-2,0);
    }

    //3e решение (сложность O(N+K)) так как мы проходимся по строке, а потом по коллекции, без вложенных циклов
    public static void threeExp(String input){

        Map<String,Integer> ansMap = new HashMap<>();
        int ansCnt = 0;
        String ans = "";

        for(String s : input.split("")) {
            if(ansMap.containsKey(s)){
                int nowCnt = ansMap.get(s);
                nowCnt++;
                ansMap.put(s,nowCnt);
            } else {
                ansMap.put(s,1);
            }
        }
        for(String s : ansMap.keySet()){
            if(ansMap.get(s) > ansCnt){
                ansCnt = ansMap.get(s);
                ans = s;
            }
        }
        System.out.println(ans + " : " + ansCnt);
    }

    public static void sqrNum (int a, int b, int c) {
        int d = (b*b) - (4 * (a*c));

        if(a == 0) {
            int x1 = -c/b;
            System.out.println(x1);
        }
        else if(d==0) {
            int x1 = (-b)/(2*a);
            System.out.println(x1);
        } else if (d > 0) {
            int x1 = (int) (-b - Math.sqrt(d)) / (2 * a);
            int x2 = (int) (-b + Math.sqrt(d)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }

    }
}
