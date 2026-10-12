class MyQueue {
    Stack<Integer>s;
    Stack<Integer>s1;
    public MyQueue() {
        s=new Stack<>();
        s1=new Stack<>();
    }
    
    public void push(int x) {
      
        while(!s.isEmpty()){
            s1.add(s.pop());
        }
          s.push(x);
        while(!s1.isEmpty()){
            s.add(s1.pop());
        }
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */