class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int closest= Integer.MAX_VALUE;
        int checkSum=0;

        for(int i=0; i<n-2; i++)
        {
            int left= i+1;
            int right= n-1;
            while(right>left)
            {
                int sum= nums[i]+nums[left]+nums[right];
                if(sum==target)
                {
                    left++;
                    right--;
                }
                else if(target>sum)
                {
                    left++;
                }
                else
                {
                    right--;
                }
                int difference= Math.abs(sum-target);
                if(difference<closest)
                {
                    closest=difference;
                    checkSum=sum;
                }
                else if(difference==closest && sum> checkSum)
                {
                    checkSum=sum;
                }


            }
        }

        return checkSum;
    }
}