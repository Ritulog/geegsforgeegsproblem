package binarysearch;

public class CeilSearchLeanear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 3;
        int index = ceilSearch(arr, target);
        if(index == -1)
            System.out.println("Ceiling of " + target + " doesn't exist in array ");
        else
            System.out.println("ceiling of " + target + " is " + arr[index]);
    }


    static int ceilSearch(int[] arr , int target){

        /* If x is smaller than or equal to first element,
            then return the first element */
        if(target <= arr[0])
            return 0;

        /* Otherwise, linearly search for ceil value */
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == target)
                return i;

            /* if x lies between arr[i] and arr[i+1] including
            arr[i+1], then return arr[i+1] */
            if(arr[i] < target && arr[i+1] >= target)
                return i+1;
        }
        /* If we reach here then x is greater than the last element
            of the array, return -1 in this case */
        return -1;
    }
}
