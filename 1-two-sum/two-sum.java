import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required complement
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices if match found
            }
            
            map.put(nums[i], i); // Store the number and its index
        }
        
        throw new IllegalArgumentException("No solution found"); // If no solution exists
    }
}
