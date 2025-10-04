class Solution {
    public int specialArray(int[] nums) {
        int x=1;
        int n= nums.length;
        while(x<=n)
        {
            int count =0;
            for(int i=0; i<n; i++){
                if(nums[i]>=x)
                {
                    count++;
                }
            }
            if(x==count)
            {
                return x;
            }
            else {
                x++;
            }
        }
        return -1;
        
    }
}
