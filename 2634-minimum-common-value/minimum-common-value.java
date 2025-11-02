class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<nums1.length; i++)
        {
            set.add(nums1[i]);
        }

        for(int j: nums2)
        {
            if(set.contains(j))
            {
                return j;
            }
        }
        return -1;
    }
}