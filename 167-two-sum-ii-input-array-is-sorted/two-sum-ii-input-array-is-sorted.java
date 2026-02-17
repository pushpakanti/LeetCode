class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];

        int i=0;
        int j= numbers.length-1;

        while(j>i)
        {
            int check= numbers[i] + numbers[j];
            
            if(check== target) break;

            else if(check>target)
            {
                j--;
            }
            else if(check<target)
            {
                i++;
            }
        }

        result[0]=i+1;
        result[1]= j+1;

        return result;

        
    }
}