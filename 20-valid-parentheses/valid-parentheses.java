class Solution {
    public boolean isValid(String s) {
        char a='(';
        char b=')';
        char c='{';
        char d='}';
        char e='[';
        char f=']';

        Stack<Character> st= new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)== a || s.charAt(i)==c || s.charAt(i)==e)
            {
                st.push(s.charAt(i));
            }

            else
            {
                if(st.size()==0) return false;
                else if(s.charAt(i)==b)
                {
                    if (st.peek()==a)
                    {
                        st.pop();
                    }
                    else return false;
                }
                else if(s.charAt(i)==d)
                {
                    if (st.peek()==c)
                    {
                        st.pop();
                    }
                    else return false;
                }
                else if(s.charAt(i)==f)
                {
                    if (st.peek()==e)
                    {
                        st.pop();
                    }
                    else return false;
                }
            }
        }

        if(st.size()==0)
        {
            return true;
        }
        else return false;
    }
}