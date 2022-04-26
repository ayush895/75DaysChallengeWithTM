class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(word.charAt(0)==board[i][j] && checkboard(i,j,board,word,0,vis))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkboard(int i,int j,char[][] board,String word,int idx,boolean[][] vis)
    {
        if(idx==word.length())
        {
            return true;
        }
        if(i<0 ||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(idx)||vis[i][j]==true)
        {
            return false;
        }
        vis[i][j]=true;
        if(checkboard(i+1,j,board,word,idx+1,vis)||
           checkboard(i,j+1,board,word,idx+1,vis)||
           checkboard(i-1,j,board,word,idx+1,vis)||
           checkboard(i,j-1,board,word,idx+1,vis)
          )
        {
            return true;
        }
        vis[i][j]=false;
        return false;
    }
    
}
