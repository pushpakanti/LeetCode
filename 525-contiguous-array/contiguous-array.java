class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int zero=0;
        int one=0;
        int res=0;

        HashMap<Integer, Integer> mp= new HashMap<>();

        for(int i=0; i<n; i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else
            {
                one++;
            }

            int diff= zero-one;

            if(diff==0)
            {
                res= Math.max(res, i+1);
            }

            if(mp.containsKey(diff))
            {
                int idx=mp.get(diff);
                int len= i-idx;
                res=Math.max(len, res);
            }
            else
            {
                mp.put(diff,i);
            }
        }
        return res;
    }
}