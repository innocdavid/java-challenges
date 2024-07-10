// 1. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// 2. You may assume that each input would have exactly one solution, and you may not use the same element twice.
// 3. You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

import java.util.ArrayList;
import java.util.List;

class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 5, 11, 15};
        int target = 9;

        int[][] result = twoSums(nums, target);

        if (result.length > 0) {
            System.out.println("Pairs found: ");
            for (int[] pair : result) {
                System.out.println(pair[0] + " " + pair[1]);
            }
        } else {
            System.out.println("No pair found");
        }
    }

    public static int[][] twoSums(int[] nums, int target) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    pairs.add(new int[]{i, j});
                }
            }
        }
        return pairs.toArray(new int[pairs.size()][]);
    }
}
