class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int n= nums.length;
        int res[]= new int[n];

        for(int i= 2*n-1; i>=0; i--)
        {
            int idx=i%n;        // for circular
            while(!st.isEmpty() && nums[st.peek()]<=nums[idx])
            {
                st.pop();
            }

            if(st.isEmpty())
            {
                res[idx]= -1;
            }
            else
            {
                res[idx]= nums[st.peek()];
            }
            st.push(idx);
        }

        return res;
    }
}