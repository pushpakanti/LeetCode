class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();

        int n= nums.length;
        int res[]= new int[n];

        st.push(nums[n-1]);

        for(int i=2*(n-1); i>=0; i--)
        {
            int idx= i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx] && st.size()>0)
            {
                st.pop();
            }

            if(st.size()==0) res[idx]=-1;
            else res[idx]= st.peek();
            st.push(nums[idx]);
        }
        return res;
    }
}