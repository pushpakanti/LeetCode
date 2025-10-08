class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> cs= new HashSet<>();

        for(int i=0; i<nums1.length; i++)
        {
            hs.add(nums1[i]);
        }

        for( int j: nums2)
        {
            if(hs.contains(j))
            {
                cs.add(j);
            }

        }

        int ans[]= new int[cs.size()];
        int idx=0;

        for(int k:cs)
        {
            ans[idx++]=k;
        }


        return ans;

    }
}