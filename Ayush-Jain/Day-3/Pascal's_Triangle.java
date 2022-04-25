class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> prevRow=null;
        for(int i=0;i<numRows;i++)
        {
            List<Integer> currRow=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    currRow.add(1);
                }
                else{
                    currRow.add(prevRow.get(j)+prevRow.get(j-1));
                }
            }
            result.add(currRow);
            prevRow=currRow;
        }
        return result;
    }
}
