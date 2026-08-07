class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0; 
        int j= numbers.length-1;
        int ans[]= new int[2];

        while(i<j)
        {
            int res= numbers[i]+numbers[j];

            if(res==target) break;

            if(res>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }

        ans[0]=i+1;
        ans[1]= j+1;

        return ans;
    }
}