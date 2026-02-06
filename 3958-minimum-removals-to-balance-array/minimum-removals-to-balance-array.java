class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int maxSize=0;
        int j=0;

        for(int i=0; i<nums.length; i++)
        {
            while(j<nums.length && nums[j]<= (long)nums[i] * k){
                j++;
            }
            maxSize= Math.max(maxSize, j-i);
        }

        int min= nums.length- maxSize;
        return min;
    }
}