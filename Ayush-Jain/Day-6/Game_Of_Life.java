class Solution {
    static int[] xdir={-1,-1,0,1,1,1,0,-1};
    static int[] ydir={0,1,1,1,0,-1,-1,-1};
    
    public int checkforlive(int i,int j,int count,int[][] board)
    {
     int m=board.length;
        int n=board[0].length;
        for(int d=0;d<8;d++)
        {
         int row=i+xdir[d];
         int col=j+ydir[d];
            if(row>=0 && col>=0 && row<m && col<n)
            {
                if(board[row][col]==1)
                {
                    count++;                    
                }
            }
        }
        if(count<2)
        {
            return 0;
        }
        else if(count==2||count==3)
        {
            return 1;
        }
       
        return 0;
    }
    
    public int checkfordead(int i,int j,int count,int[][] board)
    {
        int m=board.length;
        int n=board[0].length;
        for(int d=0;d<8;d++)
        {
         int row=i+xdir[d];
         int col=j+ydir[d];
            if(row>=0 && col>=0 && row<m && col<n)
            {
                if(board[row][col]==1)
                {
                    count+=1;
                }
            
            } 
            
        }
        if(count==3)
        {
            return 1;
        }
        return 0;
    }
    public void gameOfLife(int[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        int count=0;
        int board2[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==0)
                {
                    board2[i][j]=checkfordead(i,j,count,board);

                }
                else{
                    board2[i][j]=checkforlive(i,j,count,board);
                }   
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=board2[i][j];
            }
        }
    }
}
