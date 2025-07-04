class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb=new ArrayList<>();
        generatecombinationsum(0,candidates,new ArrayList(),comb,target);
        return comb;
    }
    void generatecombinationsum(int start,int nums[],List<Integer> current,List<List<Integer>> comb,int target)
    {
        if(target==0){
            comb.add(new ArrayList(current));
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            current.add(nums[i]);
            generatecombinationsum(i,nums,current,comb,target-nums[i]);
            current.remove(current.size()-1);
        }
    }
}