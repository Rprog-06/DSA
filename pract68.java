import java.util.*;

public class pract68 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8}; // true
        int[] nums2 = {3, 1};                  // false

        System.out.println(splitArraySameAverage(nums1));
        System.out.println(splitArraySameAverage(nums2));
    }

    public static boolean splitArraySameAverage(int[] nums) {
        int n = nums.length;
        int totalSum = Arrays.stream(nums).sum();

        // Try all subset sizes from 1 to n/2 (at least one element in each group)
        for (int size = 1; size <= n / 2; size++) {
            // If totalSum * size is divisible by n, then only proceed
            if ((totalSum * size) % n != 0) continue;
            int target = (totalSum * size) / n;
            if (backtrack(nums, 0, size, 0, target)) {
                return true;
            }
        }
        return false;
    }

    // Pure backtracking without memoization
    public static boolean backtrack(int[] nums, int index, int sizeLeft, int currentSum, int targetSum) {
        if (sizeLeft == 0) {
            return currentSum == targetSum;
        }
        if (index >= nums.length) return false;

        // Choose the current element
        if (backtrack(nums, index + 1, sizeLeft - 1, currentSum + nums[index], targetSum)) {
            return true;
        }

        // Skip the current element
        if (backtrack(nums, index + 1, sizeLeft, currentSum, targetSum)) {
            return true;
        }

        return false;
    }
}