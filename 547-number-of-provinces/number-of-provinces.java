class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[]= new boolean[isConnected.length];
        int count=0;
        for(int i=0; i<isConnected.length; i++)
        {
            if(!visited[i])
            {
                bfs(isConnected, visited, i);
                count++;
            }
        }
        return count;
        
        
    }

    void bfs(int[][] isConnected, boolean[] visited, int start)
    {
        Queue<Integer> q= new LinkedList<>();

        q.add(start);
        visited[start]= true;

        while(!q.isEmpty())
        {
            int node= q.poll();

            for(int j=0; j<isConnected.length; j++)
            {
                if(isConnected[node][j]==1 && !visited[j])
                {
                    visited[j]= true;
                    q.add(j);
                }
            }
        }
    }
}