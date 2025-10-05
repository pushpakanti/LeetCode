class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix.length; j++)
            {
                if(j>i)
                {
                    int temp= matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]= temp;
                }
            }
        }

        for(int i=0; i<matrix.length; i++){
        int low=0; int high=matrix.length-1;
        while(low<high)
        {
            int temp1= matrix[i][low];
            matrix[i][low]= matrix[i][high];
            matrix[i][high]= temp1;
            low++;
            high--;

        }
        }

    }
}