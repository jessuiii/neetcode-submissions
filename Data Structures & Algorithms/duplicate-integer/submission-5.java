class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> arrayMap = new HashSet<>();
        for(int i : nums){
            if(arrayMap.contains(i))
                return true;
            else
                arrayMap.add(i);
        }
        return false;
    }
}