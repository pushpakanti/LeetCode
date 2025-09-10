import java.util.*;


class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        for(int el: nums)
        {
            if(!freq.containsKey(el))
            {
                freq.put(el,1);
            }
            else
            {
                freq.put(el,freq.get(el)+1);
            }
        }

        int maxFreq=0;

        for(Map.Entry<Integer, Integer> e: freq.entrySet())
        {
            if(e.getValue()> maxFreq)
            {
                maxFreq=e.getValue();
            }
        }

        if(maxFreq>=2)
        {
            return true;
        }
        else return false;
    }
}