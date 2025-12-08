class Solution {
    public int countTriples(int n) {
        int a,b,c, count=0;
        for(a=1; a<=n; a++)
        {
            for(b=1; b<=n; b++)
            {
                int result= (a*a) + (b*b);
                c= (int)Math.sqrt(result);
                if(c*c ==result & c<=n)
                {
                    count++;
                }
            }
        }
        return count;
    }
}