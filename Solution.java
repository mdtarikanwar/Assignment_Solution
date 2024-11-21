import java.util.HashMap;
import java.util.Random;

public class Solution {

    public static void suffleArray(int[] arr) {
        int n = arr.length;
        Random random = new Random();
        for (int i = n - 1; i >= 0; i--) {
            int randomeIndex = random.nextInt(i + 1);

            int temp = arr[i];
            arr[i] = arr[randomeIndex];
            arr[randomeIndex] = temp;
        }
    }

    public static int romanToInteger(String romanStr) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int n = romanStr.length();
        for (int i = 0; i < n; i++) {
            int current = romanMap.get(romanStr.charAt(i));

            if (i < n - 1 && current < romanMap.get(romanStr.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static boolean isPangram(String sentance) {
        for (int i = 97; i < 123; i++) {
            if (sentance.toLowerCase().indexOf((char) i) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases for romanToInteger
        System.out.println("Roman to Integer Test Cases:");
        System.out.println("CIXX -> " + romanToInteger("CIXX")); // Expected: 119
        System.out.println("MCMXCIV -> " + romanToInteger("MCMXCIV")); // Expected: 1994
        System.out.println("LVIII -> " + romanToInteger("LVIII")); // Expected: 58
        System.out.println("IX -> " + romanToInteger("IX")); // Expected: 9
        System.out.println("XL -> " + romanToInteger("XL")); // Expected: 40
        System.out.println("MMMCMXCIX -> " + romanToInteger("MMMCMXCIX")); // Expected: 3999
        System.out.println();

        // Test cases for isPangram
        System.out.println("Is Pangram Test Cases:");
        System.out.println("\"The quick brown fox jumps over the lazy dog.\" -> "
                + isPangram("The quick brown fox jumps over the lazy dog.")); // Expected: true
        System.out.println("\"Hello World\" -> " + isPangram("Hello World")); // Expected: false
        System.out.println("\"Pack my box with five dozen liquor jugs.\" -> "
                + isPangram("Pack my box with five dozen liquor jugs.")); // Expected: true
        System.out.println("\"A wizard's job is to vex chumps quickly in fog.\" -> "
                + isPangram("A wizard's job is to vex chumps quickly in fog.")); // Expected: true
        System.out
                .println("\"This sentence is missing letters.\" -> " + isPangram("This sentence is missing letters.")); // Expected:
                                                                                                                        // false
        System.out.println();

        // Test cases for suffleArray
        System.out.println("Shuffle Array Test Cases:");
        int[] array1 = { 1, 2, 3, 4, 5 };
        System.out.print("Original Array: ");
        printArray(array1);
        suffleArray(array1);
        System.out.print("Shuffled Array: ");
        printArray(array1);

        int[] array2 = { 10, 20, 30, 40, 50 };
        System.out.print("Original Array: ");
        printArray(array2);
        suffleArray(array2);
        System.out.print("Shuffled Array: ");
        printArray(array2);

        int[] array3 = { 100 };
        System.out.print("Original Array: ");
        printArray(array3);
        suffleArray(array3);
        System.out.print("Shuffled Array: ");
        printArray(array3);

        int[] array4 = {};
        System.out.print("Original Array: ");
        printArray(array4);
        suffleArray(array4);
        System.out.print("Shuffled Array: ");
        printArray(array4);
    }

    // Utility method to print an array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}