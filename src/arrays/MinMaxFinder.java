package arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 6, 5, 2, 3 };
        int n = arr.length;
        System.out.println("minimum value :" + setMin(arr, n));
        System.out.println("minimum value :" + setMax(arr, n));
    }

    static int setMin(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
               min = arr[i];
            }
        }
        return  min;
    }

    static int setMax(int[] arr, int n){
         int max = Integer.MIN_VALUE;
         for(int i=0; i< arr.length; i++){
             if(arr[i] > max){
                 max = arr[i];
             }
         }
         return  max;
    }
}
