class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            Set<Character> hashset = new HashSet<>();
            for(int j = i ; j < s.length();j++){
                if(hashset.contains(s.charAt(j)))
                    break;
                hashset.add(s.charAt(j));
            }
            count = Math.max(count, hashset.size());
        }
    return count;
    }
}
