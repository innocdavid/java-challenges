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

class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSums(nums, target);

        if (result != null) {
            System.out.println("Paired found: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }

    public static int[] twoSums(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return null;
    }
}