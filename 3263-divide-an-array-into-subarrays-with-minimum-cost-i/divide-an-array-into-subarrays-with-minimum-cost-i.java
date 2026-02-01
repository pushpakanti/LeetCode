class Solution {
    public int minimumCost(int[] nums) {
        int ans[]= new int[nums.length];

        for(int i=1; i<nums.length; i++)
        {
            ans[i]=nums[i];
        }

        Arrays.sort(ans);

        int result= nums[0]+ans[1]+ans[2];
        return result;


        
    }
}