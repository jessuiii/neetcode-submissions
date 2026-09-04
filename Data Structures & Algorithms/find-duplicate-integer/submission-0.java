class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int duplicate = 0;
        for(int i = 0 ; i < n ; i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else{
                duplicate = nums[i];
                break;
            }
        }
        return duplicate;
    }
}
