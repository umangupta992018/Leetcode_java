class Solution 
{
    public int maxArea(int[] height) 
    {
        int lp=0,rp=height.length-1,ans=0,w=0,ht=0,currWt=0,maxWater=0;
        while(lp<rp){
            w=rp-lp;
            ht=Math.min(height[lp],height[rp]);
            currWt=w*ht;
            maxWater=Math.max(maxWater,currWt);
            if(height[lp]<height[rp]){lp++;}else rp--;
        }
        return maxWater;
        // int w=0,maximumWidth=0,area=0,ht=0;
        // for(int i=0;i<height.length;i++)
        // {
        //     for(int j=i+1;j<height.length;j++)
        //     {
        //         w=j-i;
        //         ht=Math.min(height[i],height[j]);
        //         area=w*ht;
        //         maximumWidth = Math.max(maximumWidth,area);
        //     }
        // }
        // return maximumWidth;
    }
}