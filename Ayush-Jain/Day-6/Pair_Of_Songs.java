class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
        for(int i=0;i<time.length;i++)
        {
            time[i]=time[i]%60;
        }
        int[] map=new int[60];
        for(int t:time)
        {
            if(t==0)
            {
                count+=map[0];
            }
            else{
                count +=map[60-t];
            }
            map[t]++;
        }
        return count;
    }
}
