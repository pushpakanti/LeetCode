class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int maxBestEnding= nums[0];
        int minBestEnding= nums[0];

        int maxResult= nums[0];
        int minResult= nums[0];
        int sum=nums[0];

        for(int i=1; i<nums.length; i++)
        {
            int maxCheck1= maxBestEnding +nums[i];
            int maxCheck2= nums[i];

            int minCheck1= minBestEnding +nums[i];
            int minCheck2= nums[i];

            maxBestEnding= Math.max(maxCheck1, maxCheck2);  // normaly finding maxSubarray
            minBestEnding= Math.min(minCheck1, minCheck2);   // normaly finding minSubarray

            maxResult= Math.max(maxResult, maxBestEnding);  // max subarray
            minResult= Math.min(minResult, minBestEnding);  // min subarray
 
            sum= sum+ nums[i];  // all elements sum of the array
        }

        int check= sum- minResult;      // total sum - minSubarray= circle array maxSubArray

        if (maxResult<0) return maxResult;
        return Math.max(maxResult, check);
    }
}