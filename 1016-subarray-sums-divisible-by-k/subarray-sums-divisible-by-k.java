class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        mp.put(0,1);    // to count 0 as 1 frequency means empty array

        int prefixSum=0;
        int count=0;

        for(int i=0; i<nums.length; i++)
        {
            prefixSum+=nums[i];
            int check = ((prefixSum % k) + k) % k;
            if(mp.containsKey(check))
            {
                count+=mp.get(check);
            }
            mp.put(check, mp.getOrDefault(check,0)+1);     // store the remainders into hashmap and check..
        }
        return count;
    }
}