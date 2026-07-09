class Solution {

    int n,m;
    int dx[]= {-1,1,0,0};
    int dy[]= {0,0,-1,1};

    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;

        Queue<Pair> q= new LinkedList<>();

        int fresh=0;
        int time=0;
        int i,j;

        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new Pair(i,j));
                    grid[i][j]= -2;
                }

                else
                {
                    if (grid[i][j]==1)
                    {
                        fresh++;
                    }
                }
            }
        }

        while(!q.isEmpty() && fresh>0)
        {
            time++;
            int s= q.size();

            while(s-->0)
            {
                Pair p=q.poll();

                int r= p.first;
                int c= p.second;

                for(int k=0;k<4; k++)
                {
                    int row= r+ dx[k];
                    int col= c+ dy[k];

                    if(valid(row, col, n, m) && grid[row][col]==1)
                    {
                        q.offer(new Pair(row, col));
                        grid[row][col]= -2;
                        fresh--;
                    }
                }

            }
        }

        if(fresh>0) {
            return -1;
        }
        return time;
        
    }

    public boolean valid(int i, int j, int n, int m)
    {
        if(i<0 || i>=n || j<0 || j>=m)
        {
            return false;
        }

        return true;
    }


}

class Pair
{
    int first;
    int second;

    public Pair(int first, int second)
    {
        this.first= first;
        this.second= second;
    }
}
