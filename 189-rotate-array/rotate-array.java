class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int j=0;
        int[] arr= new int[n];

        k=k%n;   //if k>n


        for(int i=n-k; i<=n-1; i++)
        {
            arr[j++]= nums[i];
        }

        for(int i=0; i<=n-k-1; i++)
        {
            arr[j++]= nums[i];
        }

        for(int i=0; i<n ; i++)
        {
            nums[i]= arr[i];
        }

        
    }
}