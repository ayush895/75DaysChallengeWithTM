class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int j=height.length-1;
        int i=0;
       while(i<=j)
       {
                if(height[i]>=height[j])
                {
                    int width=j-i;
                    area=Math.max(area,width*height[j]);
                    j--;
                }
           else {
               int width=j-i;
               area=Math.max(area,width*height[i]);
               i++;
           }
                
        }
        return area;
    }
}
