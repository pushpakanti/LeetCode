class Solution {
    public int findNumbers(int[] nums) {

        int countEven=0;

        for(int n: nums)
        {
            int count=0;
            while(n>0)
            {
                n=n/10;
                count++;
            }
            if(count%2==0)
            {
                countEven++;
            }
        }
        return countEven;
        
    }
}