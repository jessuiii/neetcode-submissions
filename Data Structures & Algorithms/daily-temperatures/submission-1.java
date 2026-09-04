/*class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temperatureStack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = temperatures.length - 1 ; i>=0 ; i++){
            while(!temperatureStack.empty() && temperatures[i] >= temperatures[temperatureStack.peek()])
                temperatureStack.pop();
            if(!temperatureStack.empty())
                result[i] = temperatureStack.peek() - i;
            temperatureStack.push(i);
        }
        return result;
    }
}*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temperatureStack = new Stack<>();
        int[] result = new int[temperatures.length];
        
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!temperatureStack.empty() && temperatures[i] >= temperatures[temperatureStack.peek()]) {
                temperatureStack.pop();
            }
            if (!temperatureStack.isEmpty()) {
                result[i] = temperatureStack.peek() - i;
            }
            temperatureStack.push(i);
        }
        
        return result;
    }
}

