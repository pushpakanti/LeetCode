class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int num1= nums[nums.length-1];
        int num2= nums[nums.length-2];
        int num3= nums[nums.length-3];
        int neg1=nums[0];
        int neg2=nums[1];

        int ans1= num1*num2*num3;
        int ans2= neg1*neg2*num1;
        
        if(ans1>ans2)
        {
            return ans1;
        }
        else
        {
            return ans2;
        }
    }
}