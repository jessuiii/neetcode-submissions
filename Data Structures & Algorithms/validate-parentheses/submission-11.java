class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> paranthesisMap = new HashMap<>();
        paranthesisMap.put('(',')');
        paranthesisMap.put('[',']');
        paranthesisMap.put('{','}');
        for(char ch : s.toCharArray()){
            if(paranthesisMap.containsKey(ch))
                stack.push(ch);
            else if(paranthesisMap.containsValue(ch)){
                if(stack.empty()||paranthesisMap.get(stack.pop())!=ch)
                    return false;
            }
        }
        return stack.empty();
    }
}
