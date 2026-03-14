class Solution {

    int square(int n)   // getting the digits squares
    {
        int sum=0;
        
        while(n>0)
        {
            int d=n%10;
            n=n/10;
            sum=sum+ (d*d);
        }
        return sum;
    }


    public boolean isHappy(int n) {

        int slow=n, fast=n;

        while(fast!=1)
        {
            slow= square(slow);
            fast= square(fast);
            fast= square(fast);

            if(slow==fast && slow!=1)
            {
                return false;
            }
        }
        return true;
        
    }
}