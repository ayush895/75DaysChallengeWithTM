class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int sr=0;
        int sc=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int er=n-1;
        int ec=m-1;
        int count=0;
        ArrayList<Integer> spiralOrder=new ArrayList<>();
    while(count<n*m){
        for(int col=sc;col<=ec && count<n*m;col++)
        {
            spiralOrder.add(matrix[sr][col]);
            count++;
        }
        for(int row=sr+1;row<=er && count<n*m;row++)
        {
            spiralOrder.add(matrix[row][ec]);
            count++;
        }
         for(int col=ec-1;col>=sc && count<n*m;col--)
        {
            spiralOrder.add(matrix[er][col]);
            count++;
        }
         for(int row=er-1;row>=sr+1 && count<n*m;row--)
        {
            spiralOrder.add(matrix[row][sr]);
            count++;
        }
        sr+=1;
        sc+=1;
        er-=1;
        ec-=1;
    }
        return spiralOrder;
    }
}
