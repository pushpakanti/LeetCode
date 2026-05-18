class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result= new ArrayList<>();
        List<Integer> current= new ArrayList<>();

        fun(candidates, 0, target, current, result); 
        return result;

        
    }

    public void fun(int[] candidates, int idx, int target, List<Integer> current, List<List<Integer>>result)
    {
        // base
        if(idx==candidates.length)
        {
            if(target==0)
            {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        fun(candidates, idx+1, target, current, result);  //not take current

        if(candidates[idx]<= target)        // take current..
        {
            current.add(candidates[idx]);

            fun(candidates,idx, target-candidates[idx], current, result);

            current.remove(current.size()-1);
        }

    }
}