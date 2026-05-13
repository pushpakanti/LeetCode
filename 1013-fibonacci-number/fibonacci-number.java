class Solution {
    public int fib(int n) {

        if(n==1 || n==0) return n;

        int ans1= fib(n-1);
        int ans2= fib(n-2);

        return ans1+ans2;
        
    }
}