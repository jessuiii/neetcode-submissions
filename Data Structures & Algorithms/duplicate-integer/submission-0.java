class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < len ; j++){
                if(i != j){
                    if(nums[i] == nums[j])
                        return true;
                }
            }
        }
        return false;
    }
}