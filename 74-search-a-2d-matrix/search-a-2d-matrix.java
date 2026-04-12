class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;   // total row
        int m= matrix[0].length;    // total col

        int low= 0; int high= n*m-1;

        while(low<=high)
        {
            int mid= low+ (high-low)/2;

            int row= mid/m;     //row
            int col= mid%m;     //columnss

            if(matrix[row][col]==target) return true;

            else if(matrix[row][col]<target)
            {
                low= mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return false;
    }
}