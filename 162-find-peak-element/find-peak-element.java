class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int st=0;
        int end= n-1;
        while(st<end)
        {
            int mid= (st+end)/2;
            if(nums[mid]<nums[mid+1])
            {
                st=mid+1;
            }
           else if(nums[mid]>nums[mid+1])
            {
                end=mid;
            }
        }
        return st;


    }
}