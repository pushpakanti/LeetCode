class Solution {
    public String removeDuplicates(String s, int k) {

        Deque<Pair<Character, Integer>> st= new ArrayDeque<>();
        int n= s.length();

        for(int i=0; i<n; i++)
        {
            char c= s.charAt(i);
            if(st.isEmpty())
            {
                st.push(new Pair<>(c,1));
                continue;
            }
            else
            {
                Pair<Character, Integer> top= st.peek();
                char first= top.getKey();
                int count= top.getValue();

                if(first!=c)
                {
                    st.push(new Pair<>(c,1));
                }
                else if(count<(k-1))
                {
                    Pair<Character, Integer> currentPair = st.pop();
                    st.push(new Pair<>(c,count+1));
                }
                else
                {
                    st.pop();
                }
            }
        }

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty())
        {
            Pair<Character, Integer> top= st.pop();

            for(int i=0; i<top.getValue(); i++)
            {
                res.insert(0, top.getKey());
            }
        }

        return res.toString();
    }
}