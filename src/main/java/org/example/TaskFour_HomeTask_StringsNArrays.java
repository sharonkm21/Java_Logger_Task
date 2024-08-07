package org.example;
import org.apache.logging.log4j.LogManager;
import java.util.Map;
import java.util.HashMap;
import org.apache.logging.log4j.Logger;

public class TaskFour_HomeTask_StringsNArrays
{private static final Logger logger = LogManager.getLogger(TaskFour_HomeTask_StringsNArrays.class);

    public static void main(String[] args) {
        //Task4.1
        logger.info("Home Task 4 Strings and Arrays");
        System.out.println("\nTask 4.1"); //Find the missing number in an array of 1-100
        int[] arrayMissing = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (i == 52) // Making 52 the missing number
                continue;
            else
                arrayMissing[i - 1] = i;
        }
        int missingNumber = findMissingNumber(arrayMissing, 100);
        System.out.println("The missing number is: " + missingNumber+"\n");


        //Task4.2
        System.out.println("\nTask 4.2"); // Find the min and max elements of an array
        int[] arrayMinMax = {0, 61, 94, 3, 70, 776, -1, 74, 2};
        findMinMax(arrayMinMax);
        arrayMinMax = new int[]{};
        findMinMax(arrayMinMax);

        //Task4.3
        System.out.println("\nTask 4.3"); // Find the duplicate characters in a string
        String inputDuplicate = "This is a sentence of duplicates";
        printDuplicateCharacters(inputDuplicate);
        System.out.println();
        String inputNonDuplicate = "abcde3$#@^&";
        printDuplicateCharacters(inputNonDuplicate);
        System.out.println();
        String inputEmpty = "";
        printDuplicateCharacters(inputEmpty);
        System.out.println();

        //Task4.4
        System.out.println("\nTask 4.4"); // Find if a string is the rotation of the other
        String str1 = "racecar";
        String str2 = "carrace";
        areStringsRotations(str1, str2);
        System.out.println();
        str1 = "racecar";
        str2 = "carraec";
        areStringsRotations(str1, str2);
        System.out.println();
        str1 = "racecr";
        str2 = "carraec";
        areStringsRotations(str1, str2);
    }

    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array)
            actualSum += num;
        return expectedSum - actualSum;
    }

    public static void findMinMax(int[] array) {
        if (array.length == 0)
            System.out.println("Array is empty");
        else {
            int min = array[0];
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
        }
    }

    public static void printDuplicateCharacters(String str)
    {
        if (str.isEmpty())
            System.out.println("String is empty.");
        else {
            Map<Character, Integer> charCountMap = new HashMap<>();
            for (char c : str.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
            System.out.println("Duplicate characters:");
            boolean foundDuplicate = false;
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
                    foundDuplicate = true;
                }
            }
            if (!foundDuplicate) {
                System.out.println("No duplicate characters found.\n");
            }
        }
    }

    public static void areStringsRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            System.out.println(s1+" and "+s2+" are not rotations of each other.");
        else {
            String concatString = s1 + s1;
            if (concatString.contains(s2))
                System.out.println(s1+" and "+s2+" are rotations of each other.");
            else
                System.out.println(s1+" and "+s2+" are not rotations of each other.");
        }
    }
}
