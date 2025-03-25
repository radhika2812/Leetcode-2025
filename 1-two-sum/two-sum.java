import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length); // Optimized capacity

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Compute required complement

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};  // Return indices when match found
            }

            map.put(nums[i], i);  // Store the current number and its index
        }

        return new int[]{}; // If no solution found, return an empty array
    }
}
