class Solution {
    public int removeDuplicates(int[] nums) {

        int first=0;
        int j=1;
        int count=1;

        while(j<nums.length)
        {
            if(nums[j]==nums[j-1])
            {
                j++;
            }

            else if(nums[j]!= nums[j-1])
            {
                nums[first+1]= nums[j];
                count++;
                j++;
                first++;

            }

        } 
        return count;
        
    }
}