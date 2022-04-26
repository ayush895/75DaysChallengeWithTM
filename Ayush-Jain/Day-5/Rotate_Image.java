class Solution {
    public void rotate(int[][] matrix) {
        int er=matrix.length-1;
        int ec=matrix.length-1;
        
        for(int i=0;i<=er;i++)
        {
        for(int j=i;j<=ec;j++)
        {
            int first=matrix[i][j];
            int second=matrix[j][i];
            matrix[i][j]=second;
            matrix[j][i]=first;
        }
        }
        for(int i=0;i<matrix.length;i++)
        {
        int left=0;
        int right=matrix.length-1;
        while(left<right)
        {
         int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            left++;
            right--;
        }
        }
    }
}
