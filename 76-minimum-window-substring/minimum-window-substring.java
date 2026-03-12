class Solution {

    boolean check(int sArr[], int tArr[])
    {
        for (int i=0; i<256; i++)
        {
            if(sArr[i]<tArr[i])
            {
                return false;
            }
        }
        return true;

    }


    public String minWindow(String s, String t) {
        if (s.length()==0 || t.length()==0) return "";

        int sArr[]= new int[256];
        int tArr[]= new int[256];

        for(int i=0; i<t.length(); i++)
        {
            tArr[t.charAt(i)]++;
        }

        int n=s.length();
        int result= Integer.MAX_VALUE;
        int start=0;
        int low=0;

        for(int high=0; high<n; high++)
        {
            sArr[s.charAt(high)]++;

            while(check(sArr, tArr))
            {
                int len= high-low+1;
                
                if(result>len)
                {
                    result=len;
                    start=low;
                }
                sArr[s.charAt(low)]--;
                low++;

            }
        }

        if(result ==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start, start+result);




    }
}