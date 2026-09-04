class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer,Integer> freq_table = new HashMap<>();
        for(int n : nums){
            freq_table.put(n,freq_table.getOrDefault(n,0)+1);
        }
        for(int key : freq_table.keySet()){
            int frequency = freq_table.get(key);
            if(bucket[frequency]==null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }
        int[] resultArray = new int[k];
        int counter = 0;
        for(int position = bucket.length - 1 ; position>=0 && counter < k ; position--){
            if(bucket[position] != null){
                for(int i : bucket[position])
                    resultArray[counter++] = i;
            }
        }
        return resultArray;
    }
}
