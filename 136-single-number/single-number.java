class Solution {
    public int singleNumber(int[] nums) {
        int len= nums.length;
        for(int i=0;i<len; i++)
        {
            for(int j=i+1;j<len; j++)
            {
                if(nums[i]==nums[j])
                {
                    nums[i]=-1;
                    nums[j]=-1;
                }
            }
        }

        int result=-1;

        for(int i=0; i<len; i++)
        {
            if(nums[i]!= -1)
            {
                result= nums[i];
            }
        }
        return result; 


    }
}