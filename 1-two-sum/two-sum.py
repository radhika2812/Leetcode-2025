from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(1, len(nums)):  # ✅ i starts from 1
            for j in range(0, i):  # ✅ j starts from 0 and is always < i
                if nums[i] + nums[j] == target:
                    return [j, i]  # ✅ Return directly when found
        return []  # ✅ Return an empty list if no pair is found

