import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Store value → index mapping

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];  // Find the complement
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};  // Return indices if found
            }
            map.put(nums[i], i);  // Store the number and its index
        }
        
        return new int[]{}; // Return empty array if no solution found
    }
}
