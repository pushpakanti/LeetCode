class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int track=0;

        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]!=val)
            {
                nums[track]=nums[j];
                k++;
                track++;
            }
        }
        return k;
    }
}