class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String, List<String>> ref_map = new HashMap<>();
        for(String str : strs){
            String frequency_string = getFrequencyString(str);
            if(ref_map.containsKey(frequency_string))
                ref_map.get(frequency_string).add(str);
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                ref_map.put(frequency_string,strList);
            }
        }
        return new ArrayList<>(ref_map.values());
    }

    public static String getFrequencyString(String str){
        int[] freq = new int[26];
        for(char c : str.toCharArray())
            freq[c - 'a']++;
        
        StringBuilder frequencyString = new StringBuilder("");
        char c = 'a';
        for(int i : freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
        return frequencyString.toString();
    }
}
