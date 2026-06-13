class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb= new StringBuilder();

        for(String s: words)
        {
            int count=0;
            for(int i=0; i<s.length(); i++)
            {
                char c= s.charAt(i);
                count= count+ weights[c-'a'];
            }

            int mod= count%26;
            char d= (char)('z'- mod);
            sb.append(d);
        }

        return sb.toString();

    }
}