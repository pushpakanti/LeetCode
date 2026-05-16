class Solution {
    public List<String> letterCombinations(String digits) {

        int n= digits.length();

        List<String> res= new ArrayList<>();
        if(n==0) return res;

        HashMap<String, String> hm= new HashMap<>();

        hm.put("2","abc");
        hm.put("3","def");
        hm.put("4","ghi");
        hm.put("5","jkl");
        hm.put("6","mno");
        hm.put("7","pqrs");
        hm.put("8","tuv");
        hm.put("9","wxyz");

        StringBuilder diary= new StringBuilder();

        fun(digits, n, 0, diary,res ,hm);
        return res;
    }

    List<String> fun(String s, int n, int idx, StringBuilder diary, List<String> res, HashMap<String, String> f)
    {
        if(n==idx)
        {
            res.add(diary.toString());
            return res;
        }

        String choice= f.get(String.valueOf(s.charAt(idx)));

        for(int j=0; j<choice.length(); j++)
        {
            diary.append(choice.charAt(j));

            fun(s,n,idx+1,diary, res, f);

            diary.deleteCharAt(diary.length()-1); 
        }

        return res;
    }
}