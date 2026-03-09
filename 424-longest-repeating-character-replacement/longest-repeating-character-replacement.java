class Solution {

    public int maxFind(int[] arr)
    {
        int max=-1;
        for(int i=0; i<arr.length; i++)
        {
            max= Math.max(max, arr[i]);
        }
        return max;
    }


    public int characterReplacement(String s, int k) {

        int n= s.length();
        int low=0;
        int high=0;
        int result= Integer.MIN_VALUE;
        int arr1[]= new int[256];

        for(high=0; high<n; high++)
        {
            arr1[s.charAt(high)]++;

            int len=high-low+1;
            int maxCount= maxFind(arr1);

            int difference= len-maxCount;

            while(difference>k)
            {
                arr1[s.charAt(low)]--;
                low++;

                len=high-low+1;
                maxCount= maxFind(arr1);

                difference= len-maxCount;


            }

            len=high-low+1;
            result= Math.max(len, result);
            
        }
        return result;

        
        
    }
}