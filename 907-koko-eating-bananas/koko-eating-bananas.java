class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
        int low=1;
        int high=piles[0];
        for(int i=1; i<n; i++)
        {
            if (piles[i]>high)
            {
                high= piles[i];
            }
        }

        int res=-1;

        while(low<=high)
        {
            int guess = low + (high - low) / 2;
            long hour=time(piles,n,guess);

            if(hour>h)
            {
                low=guess+1;
            }
            else
            {
                res=guess;
                high= guess-1;
            }
        }

        return res;
    }

    long time(int arr[],int n, int speed)
    {
        long h=0;
        for(int i=0;i<n; i++)
        {
            h=h+arr[i]/speed;

            if(arr[i]%speed!=0)
            {
                h++;
            }
        }
        return h;
    }
}