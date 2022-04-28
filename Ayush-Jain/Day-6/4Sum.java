class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    ArrayList<List<Integer>> store=new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<4){
            return store;
        }
        for(int i=0;i+3<nums.length;i++)
        {
             if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j+2<nums.length;j++)
            {
                 if(j>i+1&&nums[j]==nums[j-1])
            {
                continue;
            }
                int l=j+1;
                int m=nums.length-1;
            while(l<m){
                  int sum=nums[i]+nums[j]+nums[l]+nums[m];
                if(sum==target)
                {
                    store.add(Arrays.asList(nums[i],nums[j],nums[l],nums[m]));
                    m--;
                    while(l<m&&nums[m]==nums[m+1])
                    {
                        m--;
                    }
                    
                }
                else if(sum<target)
                {
                    l++;
                }
                else{
                    m--;
                }
            }
            }
        }
        return store;
    }
}
