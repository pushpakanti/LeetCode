class MyQueue {
    Stack<Integer> q= new Stack<>();
    Stack<Integer> p= new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        q.push(x);
    }
    
    public int pop() {
        while(q.size()>1)
        {
            p.push(q.pop());
        }
        int val =q.pop();
        while(p.size()>0)
        {
            q.push(p.pop());
        }
        return val;

    }
    
    public int peek() {
        while(q.size()>1)
        {
            p.push(q.pop());
        }
        int val =q.peek();
        p.push(q.pop());
        while(p.size()>0)
        {
            q.push(p.pop());
        }
        return val;
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        else return false;
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