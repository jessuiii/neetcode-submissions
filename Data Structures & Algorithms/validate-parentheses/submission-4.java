class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> paranthesisMap =  new HashMap<>();
        paranthesisMap.put('(',')');
        paranthesisMap.put('[',']');
        paranthesisMap.put('{','}');
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(paranthesisMap.containsKey(ch))
                stack.push(ch);
            else if(paranthesisMap.containsValue(ch)){
                if(stack.isEmpty() || paranthesisMap.get(stack.pop())!=ch)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
