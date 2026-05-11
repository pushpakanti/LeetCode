class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            String str= String.valueOf(nums[i]);

            for(int j=0; j<str.length(); j++)
            {
                char ch= str.charAt(j);
                int num= Character.getNumericValue(ch);
                list.add(num);
            }
        }

        int res[]= new int[list.size()];

        for(int i=0; i<list.size(); i++)
        {
            res[i]= list.get(i);
        }

        return res;
    }
}