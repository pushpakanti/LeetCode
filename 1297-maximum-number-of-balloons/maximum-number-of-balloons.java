class Solution {
    public int maxNumberOfBalloons(String text) {

        String ballon= "balloon";

        HashMap<Character, Integer> t= new HashMap<>();
        HashMap<Character, Integer> b= new HashMap<>();

        for(int i=0; i<text.length(); i++)
        {
            char c= text.charAt(i);
            t.put(c, t.getOrDefault(c,0)+1);
        }

        for(int j=0; j<ballon.length(); j++)
        {
            char d= ballon.charAt(j);
            b.put(d, b.getOrDefault(d,0)+1);
        }

        int res= Integer.MAX_VALUE;

        for(Map.Entry<Character, Integer> entry : b.entrySet())
        {
            char c= entry.getKey();
            int bNeed= entry.getValue();
            int tHave= t.getOrDefault(c,0);

            int times=tHave/bNeed;

            res= Math.min(res,times);
        }

        return res;
        
    }
}