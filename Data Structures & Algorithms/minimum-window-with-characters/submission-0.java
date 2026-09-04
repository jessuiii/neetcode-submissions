class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        for(char ch : t.toCharArray()){
            countT.put(ch,countT.getOrDefault(ch,0)+1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int have = 0;
        int need = countT.size();
        int reslen = Integer.MAX_VALUE;
        int[] res = {-1,-1};
        int l = 0;

        for(int r = 0 ; r < s.length() ; r++){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);

            if(countT.containsKey(c) && window.get(c).equals(countT.get(c)))
                have++;

            while(have == need){
                if((r-l+1)<reslen){
                    reslen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar,window.getOrDefault(leftChar,0)-1);
                if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar))
                    have--;
                l++;
            }

            
        }
        return reslen == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
