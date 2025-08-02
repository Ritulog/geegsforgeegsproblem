package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void frequencyCounter(int[] arr) {
        int[] fr = new int[arr.length];
        int visited = -1; // Marker for visited elements

        for (int i = 0; i < arr.length; i++) {
            if (fr[i] == visited) {
                continue; // Skip already visited elements
            }

            int count = 1; // Start count for the current element

            for (int j = i + 1; j < arr.length; j++){ // Start inner loop from i+1
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println(count);
                    fr[j] = visited; // Mark as visited
                }
            }
            fr[i] = count; // Assign count to the current index
        }

        System.out.println("Element | Frequency");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) { // Print only unvisited elements
                System.out.println("   " + arr[i] + "    |    " + fr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 2, 3, 2, 2};
        int[] arr1 = {1, 2, 3, 2, 3, 2, 2};
        frequencyCounter(arr1);

        //using stream api
        System.out.println("Using stream api");
        Map<Integer,Long> frequencyMap= Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        frequencyMap.forEach((key,value) -> System.out.println(key + " "+value));

        //using for loop
        System.out.println("Using Hashmap");
        Map<Integer, Integer> frequencyCount= new HashMap<>();
        for(Integer num:arr){
            frequencyCount.put(num,frequencyCount.getOrDefault(num,0)+1);
        }
        frequencyCount.forEach((key,value) ->System.out.println(key+ " "+value));
    }
}
