package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,3,2,4,2};
        int[] arr1={1,2,2,3,4,5,5,6,6};
         findDuplicate(arr1);

    }

    static void findDuplicate(int[] arr){
        int[] visited= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(visited[arr[i]] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break;
                    }
                }

            }
            visited[arr[i]]++;
        }
    }

    //using set
    public static void findDuplicate1(int[] arr){
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
        //  System.out.println("Duplicate elements are"+duplicate);
        duplicate.forEach(e->System.out.println("duplicate element is"+e));
    }

}
