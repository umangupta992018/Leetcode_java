class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                long target2=(long)target-(long)(nums[i])-(long)(nums[j]);
                int left=j+1;
                int right=n-1;
                while(left<right){
                    int s=nums[left]+nums[right];
                    if(s<target2){
                        left++;
                    }
                    else if(s>target2)
                    {
                        right--;
                    }
                    else{
                        List<Integer> list=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                    ans.add(list);
                    while(left<right && nums[left]==list.get(2))
                    {
                        left++;
                    }
                    while(left<right && nums[left]==list.get(3))
                    {
                        right--;
                    }
                    }
                }
            
            while(j+1<n && nums[j]==nums[j+1])
            {
                j++;
            }
            }while(i+1<n && nums[i]==nums[i+1]){
                i++;
            }}
        
        return ans;
    //     int n=nums.length;
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Arrays.sort(nums);

    //     for(int i=0;i<n;i++)
    //     {
    //         if(i>0 && nums[i]==nums[i-1]) continue;
    //         for(int j=i+1;j<n;){
    //             int p=j+1, q=n-1;

    //             while(p<q){
    //                 long sum=(long)(nums[i]) + (long)(nums[j]) + (long)(nums[p]) + (long)(nums[q]);
    //                 if(sum < target)
    //                 {
    //                     p++;
    //                 }
    //                 else if(sum < target)
    //                 {
    //                     q--;
    //                 }
    //                 else
    //                 {
    //                     ans.add(new ArrayList<>(List.of(nums[i],nums[j],nums[p],nums[q])));
    //                     //ans.add({nums[i], nums[j],  nums[p], nums[q]});
    //                     p++; q--;
    //                     while(p<q && nums[p]==nums[p-1]) p++;
    //                 }
    //             }
    //             j++;
    //             while(j<n && nums[j]==nums[j-1]) j++;
    //         }
    //     }
    //     return ans;
    }
}