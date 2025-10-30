class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (simulate(nums, i, -1))
                    count++;
                if (simulate(nums, i, 1))
                    count++;
            }
        }

        return count;


    }

    boolean simulate(int[] nums, int start, int dir) {
        int[] arr = nums.clone();
        int curr = start;
        int n = arr.length;

        while (curr >= 0 && curr < n) {
            if (arr[curr] == 0) {
                curr += dir;
            } else {
                arr[curr]--;
                dir *= -1;
                curr += dir;
            }
        }

        for (int val : arr) {
            if (val != 0)
                return false;
        }
        return true;
    }
}