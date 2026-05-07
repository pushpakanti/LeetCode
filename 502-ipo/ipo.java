class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;
        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(profits[i], capital[i]);
        }

        Arrays.sort(arr, (a,b)-> a.capital-b.capital);

        int idx = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


        while(k>0)
        {
            while(idx<n)
            {
                if(arr[idx].capital>w) break;
                maxHeap.offer(arr[idx].profit);

                idx++;
            }

            if(maxHeap.isEmpty()) return w;

            w=w+maxHeap.poll();
            k--;
        }

        return w;

    }
}

class Pair {
    int profit;
    int capital;

    Pair(int profit, int capital)
    {
        this.profit=profit;
        this.capital=capital;
    }
}