class Solution {

    public int longestOnes(int[] nums, int k) {

       int n= nums.length;
       int low=0;
       int high=0;
       int result= Integer.MIN_VALUE;
       int countZero=0;

       for(high=0; high<n; high++)
       {
        if(nums[high]==0)
        {
            countZero++;
        }

        if (countZero>k)
        {
            if(nums[low]==0)
            {
                countZero--;
            }
            low++;
            
        }
        result= Math.max(result, high-low+1);
       }

       return result;



       
        
    }
}