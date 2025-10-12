class StockSpanner {

    public StockSpanner() {
        
    }

    class Pair
    {
        int price, span;
        Pair(int price, int span)
        {
            this.price=price;
            this.span=span;
                    
        }
    }
    private Stack<Pair> st = new Stack<>();

    public int next(int price) {
        int curr=1;

        while(!st.isEmpty() && st.peek().price<=price)
        {
            curr+=st.pop().span;
        }

        st.push(new Pair(price, curr));
        return curr;


    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */