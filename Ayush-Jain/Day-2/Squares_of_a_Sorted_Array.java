class Solution {
    public int[] sortedSquares(int[] arr) {
        int[] square=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            
            square[i]=arr[i]*arr[i];
            
        }
       Arrays.sort(square);
        return square;
    }
}
