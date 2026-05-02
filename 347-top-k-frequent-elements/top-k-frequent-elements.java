class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n= nums.length;

        // min heap
        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first) return a.first-b.first;
                return Integer.compare(a.second, b.second);
            }
        );

        HashMap<Integer, Integer> mp= new HashMap<>();

        for(int i=0; i<n; i++)
        {
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: mp.entrySet())
        {
            int element= entry.getKey();
            int frequency= entry.getValue();

            Pair current= new Pair(frequency, element);

            pq.offer(current);

            if(pq.size()>k)
            {
                pq.poll();
            }
            
        }

        int[] res= new int[k];
        for(int i=k-1; i>=0; i--)
        {
            res[i]=pq.poll().second;

        }

        return res;

    }
}

class Pair
{
    int first;
    int second;

    Pair(int f, int s)
    {
        first=f;
        second=s;
    }
}