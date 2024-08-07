package org.example;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskSix_HomeTask_LoopsNArrays
{
    private static final Logger logger = LogManager.getLogger(TaskSix_HomeTask_LoopsNArrays.class);
    public static void main(String[] args) {

        //Task6.1 -largestSpanOfArray()
        //Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
        logger.info("Home Task 6 Loops and Arrays");
        logger.info("\nTask 6.1");
        System.out.println("Largest Span: "+largestSpanOfArray(new int[]{1, 4, 2, 1, 4, 4, 4}));
        logger.info("\nEnd of Task 6.1");

        //Task6.2 -canSplitSumEqually()
        // Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
        logger.info("\nTask 6.2");
        System.out.println(canSplitSumEqually(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canSplitSumEqually(new int[]{2, 1, 1, 2, 1}));
        logger.info("\nEnd of Task 6.2");

        //Task6.3 -countClumps()
        //Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
        logger.info("\nTask 6.3");
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 2, 3, 4, 5}));
        logger.info("\nEnd of Task 6.3");

        //Task6.4 -largestMirror()
        //We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
        logger.info("\nTask 6.4");
        System.out.println(largestMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(largestMirror(new int[]{1, 2, 1, 4}));
        logger.info("\nEnd of Task 6.4");

        //Task6.5 -linearIn()
        //Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
        logger.info("\nTask 6.5");
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4})); // Output: true
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})); // Output: false
        logger.info("\nEnd of Task 6.5");

        logger.info("\nEnd of Home Task 6 Loops and Arrays");
    }

    public static int largestSpanOfArray(int[] nums)
    {
        logger.debug("In largestSpanOfArray method");
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxSpan = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!firstOccurrence.containsKey(num)) {
                firstOccurrence.put(num, i);
            } else {
                int span = i - firstOccurrence.get(num) + 1;
                if (span > maxSpan) {
                    logger.trace("Span is greater than max",span,maxSpan);
                    maxSpan = span;
                }
            }
        }
        logger.debug("Exiting largestSpanOfArray method");
        return maxSpan;
    }

    public static boolean canSplitSumEqually(int[] nums) {
        logger.debug("In canSplitSumEqually method");
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;
        if (totalSum % 2 != 0)
        {
            logger.info("Total Sum is not divisible by 2");
            return false;
        }
        int leftSum = 0;
        for (int num : nums) {
            leftSum += num;
            logger.trace("Left Sum",leftSum);
            if (leftSum == totalSum / 2)
                return true;
        }
        logger.debug("Exiting canSplitSumEqually method");
        return false;
    }

    public static int countClumps(int[] nums) {
        logger.debug("In countClumps method");
        int clumpCount = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    clumpCount++;
                    inClump = true;
                    logger.trace("Clump Count for element",nums[i],clumpCount);
                }
            }
            else
                inClump = false;
        }
        logger.debug("Exiting countClumps method");
        return clumpCount;
    }

    public static int largestMirror(int[] nums) {
        logger.debug("In largestMirror method");
        int maxMirror = 0;
        int n = nums.length;
        logger.trace("Integer Length: ",n);
        for (int start = 0; start < n; start++)
            for (int end = 0; end < n; end++) {
                int length = 0;
                logger.trace("Comparing nums[start + length] == {nums[end - length]",start,nums[start + length],end,nums[end - length]);
                while (start + length < n && end - length >= 0 && nums[start + length] == nums[end - length])
                    length++;
                maxMirror = Math.max(maxMirror, length);
            }
        logger.debug("Exiting largestMirror method");
        return maxMirror;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        logger.debug("In linearIn method");
        int outerIndex = 0;
        int innerIndex = 0;
        while (outerIndex < outer.length && innerIndex < inner.length) {
            logger.trace("Comparing outer[{}] = {} with inner[{}] = {}", outerIndex, outer[outerIndex], innerIndex, inner[innerIndex]);
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }
        logger.debug("Exiting linearIn method");
        return innerIndex == inner.length;
    }
}
