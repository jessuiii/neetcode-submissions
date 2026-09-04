class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arrayMap = new HashSet<>();
        int count = 0;
        for(int num : nums)
            arrayMap.add(num);
        
        for(int num : nums){
            if(!arrayMap.contains(num - 1)){
                int sequence = 1;
                while(arrayMap.contains(num + sequence))
                    sequence++;
                count = count>sequence?count:sequence;
            }
        }
        return count;
    }
}
