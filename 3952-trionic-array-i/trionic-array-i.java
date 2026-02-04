class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;

        while(i<nums.length-1 && nums[i]<nums[i+1])
        {
            i++;
        }
        int p=i;
        if(p==0) return false;
        int j=i;

        while(j<nums.length-1 && nums[j]>nums[j+1])
        {
            j++;
        }
        int q= j;
        int k=q;

        if(q<nums.length-1 && nums[q]==nums[q+1])
        {
            return false;
        }

        while(k<nums.length-1 && nums[k]<nums[k+1])
        {
            k++;
        }

        if(p>0 && q>p && k==nums.length-1 && q<nums.length-1)
        {
            return true;
        }
        return false;

            
    }
}