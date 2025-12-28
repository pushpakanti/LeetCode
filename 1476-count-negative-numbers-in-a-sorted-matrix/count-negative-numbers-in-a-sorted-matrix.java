class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;

            for (int row = 0; row < grid.length; row++)
            {
                int left=0;
                int right= grid[row].length-1;

                while(left<=right)
                {
                    int mid= left + (right-left)/2;

                    if(grid[row][mid]<0)
                    {
                        right=mid-1;
                    }
                    else
                    {
                        left= mid+1;
                    }
                }
                count += grid[row].length-left;
                }
                return count;
    }
}