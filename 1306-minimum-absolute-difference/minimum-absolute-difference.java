class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        int res=1000;

        for(int i=1;i<n; i++)
        {
            res= Math.min(res, Math.abs(arr[i]-arr[i-1]));
        }

        List<List<Integer>> ans= new ArrayList<>();

        for(int j=1; j<n; j++)
        {
            if(arr[j]-arr[j-1]==res)
            {
                ans.add(Arrays.asList(arr[j-1],arr[j]));
            }
        }

        return ans;




    }
}