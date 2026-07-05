class Solution {
    int n,m;

    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};

    public int numIslands(char[][] grid) {
        n= grid.length;
        m= grid[0].length;

        boolean[][] vis= new boolean[n][m];
        int ans=0;

        for(int i=0; i<n; i++)
        {
            for(int j=0;j<m; j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    dfs(grid, i,j, vis);
                    ans++;
                }
            }
        }
        return ans;
        
    }

    public boolean valid(int i, int j)
    {
        if(i<0 || i>=n || j<0 || j>=m)
        {
            return false;
        }
        return true;
    }

    public void dfs(char[][] grid, int i, int j, boolean[][] vis)
    {
        vis[i][j]= true;

        for(int k=0; k<4; k++)
        {
            int row= i+dx[k];
            int col= j+dy[k];

            if(valid(row, col) && grid[row][col]== '1' && !vis[row][col])
            {
                dfs(grid, row, col, vis);
            }
        }
    }
}