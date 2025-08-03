package arrays;

class Pair1 {
    int min;
    int max;

    Pair1(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

 public class MinMaxPairFinder {
     public static Pair1 getMinMax(int[] arr) {
         if (arr == null || arr.length == 0) {
             throw new IllegalArgumentException("Array should not be empty");
         }

         int min = arr[0];
         int max = arr[0];

         for (int i = 1; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = arr[i];
             } else if (arr[i] > max) {
                 max = arr[i];
             }
         }

         return new Pair1(min, max);
     }

     public static void main(String[] args) {
         int[] arr1 = {3, 2, 1, 56, 10000, 167};
         Pair1 result1 = getMinMax(arr1);
         System.out.println("Min: " + result1.min + ", Max: " + result1.max);

         int[] arr2 = {1, 345, 234, 21, 56789};
         Pair1 result2 = getMinMax(arr2);
         System.out.println("Min: " + result2.min + ", Max: " + result2.max);

         int[] arr3 = {56789};
         Pair1 result3 = getMinMax(arr3);
         System.out.println("Min: " + result3.min + ", Max: " + result3.max);
     }

}
