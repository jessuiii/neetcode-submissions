class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> num_map = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(num_map.contains(nums[i]))
                return true;
            else
                num_map.add(nums[i]);
        }
        return false;
    }
}