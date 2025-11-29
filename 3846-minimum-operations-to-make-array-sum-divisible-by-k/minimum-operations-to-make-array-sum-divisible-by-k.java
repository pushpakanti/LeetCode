class Solution {
    public int minOperations(int[] nums, int k) {

        int count=0;
        for(int num:nums)
        {
            count+=num;
        }

        int re=count%k;

        return re;
        
    }
}