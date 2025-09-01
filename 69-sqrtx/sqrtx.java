class Solution {
    public int mySqrt(int x) {
        long low=1, high=x;
        long mid;
        while(low<=high)
        {
        mid= (low+high)/2;

        if(mid*mid == x)
        {
            return (int) mid;
        }
        else if (mid*mid<x)
        {
            low = mid +1;
        }
        else 
        {
            high=mid-1;
        }
        }

        return (int) high;
    }
}