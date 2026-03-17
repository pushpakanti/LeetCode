class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxBestEnding= nums[0];
        int minBestEnding= nums[0];
        int maxSum= nums[0];
        int minSum= nums[0];

        for(int i=1; i<nums.length; i++)
        {
            int maxcheck1= maxBestEnding + nums[i];
            int maxcheck2= nums[i];

            int mincheck1= minBestEnding + nums[i];
            int mincheck2= nums[i];

            maxBestEnding= Math.max(maxcheck1, maxcheck2);  // for max subarray
            maxSum= Math.max(maxSum, maxBestEnding);

            minBestEnding= Math.min(mincheck1, mincheck2);  // for min subarray
            minSum= Math.min(minSum, minBestEnding);
        }


        minSum= Math.abs(minSum);
        maxSum= Math.abs(maxSum);

        if(minSum> maxSum)
        {
            return minSum;
        }
        return maxSum;

        
    }
}