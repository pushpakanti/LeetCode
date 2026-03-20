class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        mp.put(0,1);    // to count 0 as 1 frequency means empty array

        int prefixSum=0;
        int count=0;

        for(int i=0; i<nums.length; i++)
        {
            prefixSum+=nums[i];
            int check= prefixSum-k;

            if(mp.containsKey(check))
            {
                count+=mp.get(check);
            }
            mp.put(prefixSum, mp.getOrDefault(prefixSum,0)+1);     // stor the prefix sum only
        }
        return count;
    }
}