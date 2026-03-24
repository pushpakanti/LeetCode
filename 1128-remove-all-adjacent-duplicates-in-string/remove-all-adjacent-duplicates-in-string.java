class Solution {
    public String removeDuplicates(String s) {

        if (s.length() == 0) return "";

        Stack<Character> st= new Stack<>();
        st.push(s.charAt(0));

        for(int i=1; i<s.length(); i++)
        {
            if(!st.isEmpty() && st.peek()==s.charAt(i))
            {
                st.pop();
                continue;
            }
            else
            {
                st.push(s.charAt(i));
            }
        }

        String res="";
        while(!st.isEmpty())
        {
            res+=st.peek();
            st.pop();
        } 

        String f="";
        for(int j=res.length()-1; j>=0; j--)
        {
            f+=res.charAt(j);
        }
        
        return f;
    }
}