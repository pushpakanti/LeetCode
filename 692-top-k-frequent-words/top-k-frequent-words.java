class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n= words.length;

        HashMap<String, Integer> mp= new HashMap<>();

        for(String s: words)
        {
            mp.put(s, mp.getOrDefault(s,0)+1);
        }

        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b)->
            {
                if(a.second!=b.second) return a.second-b.second;
                return b.first.compareTo(a.first);
            }
        );

        for(Map.Entry<String, Integer> entry: mp.entrySet())
        {
            String element= entry.getKey();
            int frequency= entry.getValue();

            Pair current= new Pair(element, frequency);

            pq.offer(current);

            if(pq.size()>k)
            {
                pq.poll();
            }
        }

        List<String> ls= new ArrayList<>();

        for(int i=0; i<k; i++)
        {
            ls.add(pq.poll().first);
        }

        Collections.reverse(ls);

        return ls;
    }
}

class Pair
{
    String first;
    int second;

    Pair(String f, int s)
    {
        first=f;
        second=s;
    }
}