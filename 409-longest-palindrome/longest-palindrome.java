class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> mp= new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            mp.put(c, mp.getOrDefault(c,0)+1);
        }

        boolean odd= false;
        int res=0;

        for(Map.Entry<Character, Integer> entry : mp.entrySet())
        {
            char c= entry.getKey();
            int val= entry.getValue();

            if(val%2==0)
            {
                res+=val;
            }
            else
            {
                odd= true;
            }
        }

        if(odd==false)
        {
            return res;
        }
        else
        {
            for(Map.Entry<Character, Integer> entry : mp.entrySet())
            {
                char c= entry.getKey();
                int val= entry.getValue();

                if(val%2==1)
                {
                    res+=val-1;
                }
            }
        }

        return res+1;

    }
}