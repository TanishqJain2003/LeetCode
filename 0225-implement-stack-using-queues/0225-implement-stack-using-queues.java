class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    // 1 2 3 4
    public int pop() {
         for(int i = 1 ; i <= q.size()-1 ; i++){
            q.add(q.remove());
        }
        // 4 1 2 3
        int x =  q.remove(); // 4   1 2 3
        return x;
    }
    
    // 1 2 3 4 
    public int top() {
        for(int i = 1 ; i <= q.size()-1 ; i++){
            q.add(q.remove());
        }
        // 4 1 2 3 
        int x = q.peek(); // 4
        q.add(q.remove());
        return x;
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */