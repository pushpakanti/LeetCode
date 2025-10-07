class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums2) {
            while (st.size() != 0 && num > st.peek()) {
                int p = st.pop();
                mp.put(p, num);
            }
            st.push(num);
        }

        while (!st.isEmpty()) {
            mp.put(st.pop(), -1);
        }

        int[] ans= new int[nums1.length];

        int i=0;
        for(int num: nums1)
        {
            ans[i]= mp.get(nums1[i]);
            i++;
        }

        return ans;

    }
}