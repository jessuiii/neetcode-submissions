class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temperatureStack = new Stack<>();
        int[] result = new int[temperatures.length];
        temperatureStack.push(temperatures[0]);
        for(int i=1 ; i < temperatures.length ; i++){
            if(temperatures[i]<temperatureStack.peek())
                temperatureStack.push(temperatures[i]);
            else{
                result[i] = i - 0;
                temperatureStack.pop();
            }
        }
        return result;
    }
}
