class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m= new HashMap<>();
        HashMap<Character, Integer> r= new HashMap<>();

        for(int i=0; i<ransomNote.length(); i++)
        {
            char c1=ransomNote.charAt(i);
            r.put(c1, r.getOrDefault(c1,0)+1);
        }

        for(int i=0; i<magazine.length(); i++)
        {
            char c2=magazine.charAt(i);
            m.put(c2, m.getOrDefault(c2,0)+1);
        }

        return hm(m, r);

    }

    boolean hm(HashMap<Character, Integer> m, HashMap<Character, Integer> r)
    {
        for(char key: r.keySet())
        {
            if(m.getOrDefault(key,0) <r.get(key))
            {
                return false;
            }
        }
        return true;
    }
}