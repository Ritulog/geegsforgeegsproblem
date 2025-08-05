package arrays;

public class PrintSubArray {
    public static void main(String[] args) {
        int n =5;
        int arr[] ={1,2,3,4,5};
        for(int st=0; st<n; st++){
            for(int end = st; end<n; end++){
                for(int i=st; i<end; i++){
                    System.out.println(arr[i]);
                }
                System.out.println("");
            }
        }
    }
}
