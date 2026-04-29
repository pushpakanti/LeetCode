class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap= new PriorityQueue<>();

        for(int i=0; i<k; i++)
        {
            minHeap.add(nums[i]);
        }

        for(int j=k; j<nums.length; j++)
        {
            if(minHeap.peek()>nums[j]) continue;

            minHeap.poll();
            minHeap.add(nums[j]);
        }

        return minHeap.peek();

    }
}