package string;

class ShuffleString {

  // length check remains same
  static boolean checkLength(String first, String second, String result) {
    return (first.length() + second.length() == result.length());
  }

  // O(n) shuffle check without sorting
  static boolean shuffleCheck(String first, String second, String result) {
    int i = 0, j = 0, k = 0;

    while (k < result.length()) {
      if (i < first.length() && first.charAt(i) == result.charAt(k)) {
        i++;
      } else if (j < second.length() && second.charAt(j) == result.charAt(k)) {
        j++;
      } else {
        return false;
      }
      k++;
    }

    // both strings should be fully consumed
    return (i == first.length() && j == second.length());
  }

  public static void main(String[] args) {
    String first = "XY";
    String second = "12";
    String[] results = {"1XY2", "Y1X2", "Y21XX"};

    for (String result : results) {
      if (checkLength(first, second, result) && shuffleCheck(first, second, result)) {
        System.out.println(result + " is a valid shuffle of " + first + " and " + second);
      } else {
        System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
      }
    }
  }
}
/*
checkLength() → O(1)

shuffleCheck() → O(n) (single pass)

For m test cases → O(m * n)
 */
