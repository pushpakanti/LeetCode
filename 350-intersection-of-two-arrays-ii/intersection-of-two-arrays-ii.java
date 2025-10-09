class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     Map<Integer, Integer> mp = new HashMap<>();
     for(int n: nums1)
     {
        if(!mp.containsKey(n))
        {
            mp.put(n,1);
        }
        else
        {
            mp.put(n,mp.get(n)+1);
        }
     }

     ArrayList<Integer> list= new ArrayList<>();

     for(int m: nums2)
     {
        if(mp.containsKey(m) && mp.get(m)>0)
        {
            list.add(m);
            mp.put(m,mp.get(m)-1);
        }
     }

     int ans[]= new int[list.size()];
     int idx=0;

     for(int k: list)
     {
        ans[idx++]=k;
     }

     return ans;





    }
}