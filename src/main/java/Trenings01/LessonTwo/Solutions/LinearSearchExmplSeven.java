package Trenings01.LessonTwo.Solutions;

public class LinearSearchExmplSeven {

    public static void main(String[] args) {

        int[] array = {3, 1, 4, 3, 5, 1, 1, 3, 1};
        System.out.println(foo(array));


    }

    public static int foo(int[] island){

        int maxPos = 0; //вершина острова (value)
        int indexMaxPos = 0; //индекс вершины острова
        for(int i = 0; i < island.length; i++){
            if(maxPos < island[i]){
                maxPos = island[i];
                indexMaxPos = i;
            }
        }

        int ans = 0; //ответ
        int nowM = 0; //текущий максимум

        //проходим слева направо до вершины
        for(int i = 0; i < indexMaxPos; i++){
            if(nowM < island[i]){
                nowM = island[i];
            } else {
                ans += nowM - island[i];
            }
        }

        nowM = 0; // обнуляем текущий максимум и проходим справа на лево до вершины

        for(int i = island.length-1; i > indexMaxPos; i--){
            if(nowM < island[i]){
                nowM = island[i];
            } else {
                ans += nowM - island[i];
            }

        }


        return ans;
    }

}
