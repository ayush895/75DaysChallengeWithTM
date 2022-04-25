class Solution {
      public class Interval{
            int start;
            int end;
            Interval(int start,int end)
            {
                this.start=start;
                this.end=end;
            }
        }
    public class Mycomparator implements Comparator<Interval>{
        public int compare(Interval i1,Interval i2){
            return i1.start-i2.start;
        } 
    }
    public int[][] merge(int[][] intervals) {
     ArrayList<Interval> list=new ArrayList<>();
        for(int[] i:intervals)
        {
            list.add(new Interval(i[0],i[1]));
        }
        if(list.size()<=1)
            return intervals;
        Collections.sort(list,new Mycomparator());
        ArrayList<Interval> result=new ArrayList<>();
        Interval prev=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            Interval curr=list.get(i);
            if(prev.end>=curr.start)
            {
                Interval merged=new Interval(prev.start,Math.max(prev.end,curr.end));
                prev=merged;
            }
            else{
                result.add(prev);
                prev=curr;
            }
        }
        result.add(prev);
        int[][] res=new int[result.size()][2];
        int j=0;
        for(Interval i:result)
        {
            res[j][0]=i.start;
            res[j][1]=i.end;
            j++;
        }
        return res;
    }
    
}
