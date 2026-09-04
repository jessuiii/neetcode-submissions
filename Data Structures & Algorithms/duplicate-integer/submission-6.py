class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        count = 0
        for i in nums:
            j = i+1
            for j in nums:
                if i == j:
                    count += 1
                    return False
                    break
        return True
        