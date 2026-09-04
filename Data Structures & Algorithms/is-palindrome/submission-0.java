class Solution {
    public boolean isPalindrome(String s) {

        public boolean alphaNum(char c){
            return (c>='A' && c<='Z')||
                    (c>='a' && c<='z')||
                    (c>='0' && c<='9')
        }

        int l = 0, r = s.length()-1;

        while(l < r){
            while(l < r && !alphaNum.charAt(l))
                l++;
            while(l < r && !alphaNum.charAt(r))
                r--;
            if(Character.lowercase(s.charAt(l) != Character.lowercase(s.charAt(r))))
                return false;
            l++ r--;
        }

        return true;
    }
}
