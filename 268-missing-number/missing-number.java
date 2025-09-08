class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length,i;
        for(i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp= nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(i=0;i<n; i++)
        {
            if(nums[i]==i)
            {
                continue;
            }
            else
            {
                return i;
            }
        }
        return i;
    }
}