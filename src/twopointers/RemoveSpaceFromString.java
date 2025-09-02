package twopointers;

public class RemoveSpaceFromString {


    //brute force approch
    static String preserveSpace(String str) {
        // Edge case: if string is null or empty
        if (str == null || str.length() == 0) {
            return str;
        }

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        // Step 1: Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
        // Step 2: Fill characters from input into result (reversed, skipping spaces)
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                while (j >= 0 && result[j] == ' ') { // skip spaces
                    j--;
                }
                if (j >= 0) {
                    result[j] = inputArray[i];
                    j--;
                }
            }
        }

        return String.valueOf(result);
    }


    // Two-pointer approach
    public static String preserveSpace1(String str) {
        // Edge case: null or empty string
        if (str == null || str.length() == 0) {
            return str;
        }

        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] == ' ') {
                start++;
            } else if (arr[end] == ' ') {
                end--;
            } else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        // Test all edge cases
        System.out.println("1. Empty String: '" + preserveSpace("") + "'");
        System.out.println("2. Only Spaces: '" + preserveSpace("     ") + "'");
        System.out.println("3. Single Char: '" + preserveSpace("x") + "'");
        System.out.println("4. Single Space: '" + preserveSpace(" ") + "'");
        System.out.println("5. No Spaces: '" + preserveSpace("hello") + "'");
        System.out.println("6. Multiple Spaces: '" + preserveSpace("a  b c") + "'");
        System.out.println("7. Leading/Trailing Spaces: '" + preserveSpace("  ab cd  ") + "'");
        System.out.println("8. Palindrome with Spaces: '" + preserveSpace("n u r s e s   r u n") + "'");
        System.out.println("9. Normal Sentence: '" + preserveSpace("internship at geeks for geeks") + "'");
    }
}
