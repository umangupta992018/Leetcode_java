class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> list=new ArrayList<>();

       for(int i=0;i<nums.length-2;i++)
       {
        if(i>0&&nums[i]==nums[i-1]) continue;

        int res=0-nums[i];
        int start=i+1;
        int end=nums.length-1;

        while(start<end)
        {
            int sum=nums[start]+nums[end];

            if(sum==res)
            {
                list.add(Arrays.asList(nums[i],nums[start],nums[end]));

                while(start<end && nums[start] == nums[start+1]) start++;
                while(start<end && nums[end] == nums[end - 1]) end--;

                start++;
                end--;
            }
            else if(sum>res)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
       }

    return list;
    }
}