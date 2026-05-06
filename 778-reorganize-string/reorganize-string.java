class Solution {
    public String reorganizeString(String s) {

        HashMap<Character, Integer> mp= new HashMap<>();

        for(char c: s.toCharArray())
        {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }

        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b)-> {
                if(a.first!=b.first) return b.first-a.first;
    
           return a.second - b.second;
            }

        );

        for(char ch: mp.keySet())
        {
            pq.offer(new Pair(mp.get(ch),ch));
        }

        StringBuilder result= new StringBuilder();

        while(!pq.isEmpty())
        {
            Pair p= pq.poll();
            
            // can place
            if(result.length()==0 || result.charAt(result.length()-1)!=p.second)
            {
                result.append(p.second);
                p.first--;

                if(p.first>0)
                {
                    pq.offer(p);
                }
            }

            else // no character available
            {
                if (pq.isEmpty()) {
                    return "";
                }

                Pair p2 = pq.poll();

                result.append(p2.second);
                p2.first--;

                if (p2.first > 0) {
                    pq.offer(p2);
                }

                pq.offer(p);
            }

        }

        return result.toString();

    }
}

class Pair
{
    int first;
    char second;

    Pair(int f, char c)
    {
        first= f;
        second =c;
    }
}