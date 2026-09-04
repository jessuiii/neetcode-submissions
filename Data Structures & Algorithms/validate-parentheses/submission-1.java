class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> paranthesisMap =  new HashMap<>();
        paranthesisMap.put('(',')');
        paranthesisMap.put('[',']');
        paranthesisMap.put('{','}');
        Stack<Character> stack = new Stack<>();
        for(char param : s.toCharArray()){
            if(paranthesisMap.containsKey(param))
                stack.push(param);
        }
        for(char param : s.toCharArray()){
            if(param == stack.peek()){
                stack.pop();
                return true;
            }
        }
        return false;
    }
}
