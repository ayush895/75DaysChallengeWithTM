class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
     List<List<Integer>> result=new ArrayList<>();
        if(nums.length<=2)
        {
            return result;
        }
        for(int num1idx=0;num1idx+2<nums.length;num1idx++)
        {
            if(num1idx>0 && nums[num1idx]==nums[num1idx-1])
            {
                continue;
            }
            int num2idx=num1idx+1;
            int num3idx=nums.length-1;
            while(num2idx<num3idx)
            {
                int sum=nums[num1idx]+nums[num2idx]+nums[num3idx];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[num1idx],nums[num2idx],nums[num3idx]));   
                        num3idx--;
                    while(num2idx<num3idx && nums[num3idx]==nums[num3idx+1])
                        num3idx--;
                }
                else if(sum>0)
                {
                    num3idx--;
                }
                else{
                    num2idx++;
                }
            }
            
        }
        return result;
    }
}
