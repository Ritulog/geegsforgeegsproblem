package arraygfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void findLeadersBruteForce(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Check if arr[i] is greater than all elements to its right
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            // Print leader
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void findLeadersOptimized(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];

        // A list to store leaders (since we are going right to left)
        List<Integer> leaders = new ArrayList<>();
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Leaders are collected in reverse order, so reverse them
        Collections.reverse(leaders);

        // Print leaders
        System.out.println("Leaders: " + leaders);
    }


    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.print("Leaders: ");
        findLeadersBruteForce(arr1); // Output: 17 5 2
        findLeadersOptimized(arr1);  // Output: [17, 5, 2]

        int[] arr2 = {1, 2, 3, 4, 5, 2};
        findLeadersOptimized(arr2);  // Output: [5, 2]
    }
}
