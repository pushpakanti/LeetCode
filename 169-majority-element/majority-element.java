class Solution {
    public int majorityElement(int[] nums) {
        int len= nums.length;
        int count=0, candidate=0;
        for(int i=0; i<len; i++)
        {
            if(count==0)
            {
                candidate=nums[i];
                count=1;
            }
            else if(nums[i]==candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return candidate;
    }
}