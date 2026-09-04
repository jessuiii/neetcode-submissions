class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    int min;
    public MinStack() {
        stack = new Stack<>();  
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty()){
            min = val;
            stack.push(val);
            minStack.push(val);
        }
        else if(val<min){
            min = val;
            stack.push(val);
            minStack.push(min);
        }
        else if(val>=min){
            stack.push(val);
            minStack.push(min);
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
