import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

// for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
// for(int i=0;i<nums.length-1;i++)
// {
//     for(int j=i+1;j<nums.length;j++)
//     {
//         if(nums[i]+nums[j]==target)
//         {
//             return new int[]{i,j};
//         }
//     }
// }