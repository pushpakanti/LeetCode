class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int st=0;
        int end= n-1;
        while(st<end)
        {
            int mid= (st+end)/2;
            if(arr[mid]<arr[mid+1])
            {
                st=mid+1;
            }
           else if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                end=mid-1;
            }
        }
        return st;
    }
}