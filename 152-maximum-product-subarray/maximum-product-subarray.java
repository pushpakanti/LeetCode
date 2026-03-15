class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding= nums[0];
        int minEnding= nums[0];
        int ans= nums[0];

        for (int i=1; i<nums.length ; i++)
        {
            int check1= nums[i];
            int check2= maxEnding * nums[i];
            int check3= minEnding * nums[i];



            maxEnding= Math.max(check1, Math.max(check2,check3));
            minEnding= Math.min(check1, Math.min(check2,check3));
            ans=Math.max(ans, Math.max(maxEnding, minEnding));
        }        
        return ans;
        
    }
}