class Solution {
    public int[] getSneakyNumbers(int[] nums) {
    HashMap<Integer, Integer> map= new HashMap<>();
    int count=0;

    for(int i=0; i<nums.length; i++)
    {
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    }

    int res[]=new int[2];

    int idx=0;
    for(Map.Entry<Integer, Integer> entry : map.entrySet())
    {
        if(entry.getValue()==2)
        {
            res[idx++]= entry.getKey();
        }
    }
    return res;


    }
}