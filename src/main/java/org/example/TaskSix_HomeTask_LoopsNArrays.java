package org.example;
import java.util.HashMap;

public class TaskSix_HomeTask_LoopsNArrays
{
    public static void main(String[] args) {

        //Task6.1 -largestSpanOfArray()
        //Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
        System.out.println("\nTask 6.1");
        System.out.println("Largest Span: "+largestSpanOfArray(new int[]{1, 4, 2, 1, 4, 4, 4}));
        System.out.println();

        //Task6.2 -canSplitSumEqually()
        // Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
        System.out.println("\nTask 6.2");
        System.out.println(canSplitSumEqually(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canSplitSumEqually(new int[]{2, 1, 1, 2, 1}));
        System.out.println();

        //Task6.3 -countClumps()
        //Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
        System.out.println("\nTask 6.3");
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 2, 3, 4, 5}));
        System.out.println();

        //Task6.4 -largestMirror()
        //We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
        System.out.println("\nTask 6.4");
        System.out.println(largestMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(largestMirror(new int[]{1, 2, 1, 4}));
        System.out.println();

        //Task6.5 -linearIn()
        //Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
        System.out.println("\nTask 6.5");
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4})); // Output: true
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})); // Output: false
        System.out.println();
    }

    public static int largestSpanOfArray(int[] nums) {
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxSpan = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!firstOccurrence.containsKey(num)) {
                firstOccurrence.put(num, i);
            } else {
                int span = i - firstOccurrence.get(num) + 1;
                if (span > maxSpan) {
                    maxSpan = span;
                }
            }
        }
        return maxSpan;
    }

    public static boolean canSplitSumEqually(int[] nums) {
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;
        if (totalSum % 2 != 0)
            return false;
        int leftSum = 0;
        for (int num : nums) {
            leftSum += num;
            if (leftSum == totalSum / 2)
                return true;
        }
        return false;
    }

    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    clumpCount++;
                    inClump = true;
                }
            }
            else
                inClump = false;
        }
        return clumpCount;
    }

    public static int largestMirror(int[] nums) {
        int maxMirror = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++)
            for (int end = 0; end < n; end++) {
                int length = 0;
                while (start + length < n && end - length >= 0 && nums[start + length] == nums[end - length])
                    length++;
                maxMirror = Math.max(maxMirror, length);
            }
        return maxMirror;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;
        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }
        return innerIndex == inner.length;
    }
}
