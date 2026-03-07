class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int high=0;
        int low=0;
        int result=0;

        Map<Character,Integer> mp= new HashMap<>();

        for(high=0; high<n; high++)
        {
            char value= s.charAt(high);
            
            if(mp.containsKey(value)){
                low= Math.max(mp.get(value)+1, low); //if char already seen, move left pointer after its last occurrence                
            }
            mp.put(value, high);
            result= Math.max(result, high-low+1);
        }
        return result;

    }
}