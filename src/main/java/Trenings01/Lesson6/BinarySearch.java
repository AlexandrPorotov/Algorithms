package Trenings01.Lesson6;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println("start");
        int[] arr = new int[1000000];
        for(int i = 0; i < 1000000; i++){
            arr[i] = i + 1;
        }
        int find = 23;
        System.out.println(search(arr,find));
        System.out.println(arr.length);

    }

    public static int search(int[] array, int find){

        int left = 0;
        int right = array.length - 1;
        int result = 0;

        while (left <= right){
            System.out.println("left = " + left + " right = " + right);
            int middle = (right  + left) / 2;
            System.out.println(middle);
            if(array[middle] == find) {
                result = middle;
                break;}
            if(array[middle] > find) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return result;
    }
}
