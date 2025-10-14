class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (freq.containsKey(nums[i])) {
                int storedIndex = freq.get(nums[i]);
                if (i - storedIndex <= k) {
                    return true;
                }
            }
            freq.put(nums[i],i);

        }
        return false;
    }
}