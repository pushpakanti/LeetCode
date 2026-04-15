class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        int n= words.length;

        int res=Integer.MAX_VALUE;

        for(int i=0; i<words.length; i++)
        {
            if(words[i].equals(target))
            {

                int right= (i-startIndex+n)%n;
                int left= (startIndex-i+n)%n;

                res = Math.min(res, Math.min(right, left));

            }

        }

        return res == Integer.MAX_VALUE ? -1 : res;
        
    }
}