class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;

        int low=0, high=n-1;
        int ans1=-1, ans2=-1;
        int res[]= new int[2];
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(target==nums[mid])
            {
                ans1=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
        }

        int low1=0, high1=n-1;
        while(low1<=high1)
        {
            int mid=(low1+high1)/2;
            if(target==nums[mid])
            {
                ans2=mid;
                low1=mid+1;
            }
            else if(nums[mid]<target)
            {
                low1=mid+1;
            }
            else if(nums[mid]>target)
            {
                high1=mid-1;
            }
        }


        res[0]= ans1;
        res[1]= ans2;
        return res;

    }
}