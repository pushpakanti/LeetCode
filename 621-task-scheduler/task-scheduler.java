class Solution {
    public int leastInterval(char[] tasks, int n) {
        int p= tasks.length;

        HashMap<Character, Integer> freq= new HashMap<>();
        HashMap<Character, Integer> free= new HashMap<>();

        for(int i=0; i<p; i++)
        {
            freq.put(tasks[i], freq.getOrDefault(tasks[i],0)+1);
            free.put(tasks[i], 1);
        }

        PriorityQueue<Pair> pq= new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first) return b.first-a.first;
                return b.second-a.second;
            }
        );

        for(char ch: freq.keySet())
        {
            pq.add(new Pair(freq.get(ch),ch));
        }

        int seat=1;

        while(!pq.isEmpty())
        {
            ArrayList<Pair> pulled= new ArrayList<>();
            boolean done= false;

            while(!pq.isEmpty())
            {
                
                Pair p1= pq.poll();

                int fr=p1.first;
                char ch= p1.second;

                if(free.get(ch)<=seat)
                {
                    fr--;

                    free.put(ch, seat+n+1);

                    if(fr>0)
                    {
                        pq.add(new Pair(fr,ch));
                    }

                    done = true;
                    break;
                }
                else
                {
                    pulled.add(p1);
                }
            }

           for(Pair x: pulled)
           {
            pq.add(x);
           }
            seat++;


        }

        return seat-1;






    }
}

class Pair
{
    int first;
    char second;

    Pair(int f, char c)
    {
        first=f;
        second=c;
    }
}