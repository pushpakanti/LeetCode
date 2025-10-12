class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> cs= new HashSet<>();

        for(int i =0; i<nums1.length; i++)
        {
            hs.add(nums1[i]);
        }

        for(int i =0; i<nums2.length; i++)
        {
            cs.add(nums2[i]);
        }

        List<Integer> list0= new ArrayList<>();
        List<Integer> list1= new ArrayList<>();

        for(int i:hs)
        {
            if(!cs.contains(i))
            {
                list0.add(i);
            }
        }
        
        for(int i:cs)
        {
            if(!hs.contains(i))
            {
                list1.add(i);
            }
        }

        List<List<Integer>> answer= new ArrayList<>();
        answer.add(list0);
        answer.add(list1);

        return answer;

    }
}