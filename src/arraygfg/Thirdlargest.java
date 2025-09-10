package arraygfg;

class  Thirdlargest{

    //brute force
    public static int maxProductBruteForce(int[] arr) {
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int product = arr[i] * arr[j] * arr[k];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
        return maxProduct;
    }


    // optimal
    static int thirdlargest(int[] arr){
        int fisrt = -1;
        int second = -1;
        int third = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > fisrt){
                second = fisrt;
                third = second;
                fisrt = arr[i];
            }
            else if(arr[i] < fisrt && arr[i] > second ){
                third = second;
                second = arr[i];
            }
            else if(arr[i] < second && arr[i] > third ){
                third = arr[i];
            }
        }
         return third;
    }
    public static void main(String[] args) {
       int[] arr = {12, 35, 1, 10, 34, 1};
       int second = thirdlargest(arr);
       System.out.println(second);

    }
}