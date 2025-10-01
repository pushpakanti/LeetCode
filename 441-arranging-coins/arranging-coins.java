class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int k=0;
        while(n>=0)
        {
            n= n-i;
            k++;
            i++;
        }
        return k-1;
    }
}