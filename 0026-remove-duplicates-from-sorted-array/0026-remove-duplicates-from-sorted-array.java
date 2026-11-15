class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j]!=nums[i])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
        // HashSet<Integer> set = new HashSet<Integer>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     set.add(nums[i]);
        // }
        
    }
}