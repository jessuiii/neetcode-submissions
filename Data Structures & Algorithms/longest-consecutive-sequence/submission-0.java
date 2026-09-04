class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int flag = count;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[j]-nums[i]==1)
                    count++;
                    if(flag<count)flag = count;
                    else count = flag;
            }
        }
        return count;
    }
}
