class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempStack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = temperatures.length - 1 ; i >= 0 ; i--){
            while(!tempStack.empty() && temperatures[i] >= temperatures[tempStack.peek()])
                tempStack.pop();
            if(!tempStack.empty())
                result[i] = tempStack.peek() - i;
            tempStack.push(i);
        }
        return result;
    }
}

