class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        sumres = 0.0
        for i in nums1:
            sumres += i
        avg = sumres/len(nums1)
        return avg
        