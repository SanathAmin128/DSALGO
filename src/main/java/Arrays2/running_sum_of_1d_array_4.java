/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2;

/**
 *
 * @author SANATH
 */
public class running_sum_of_1d_array_4
{
    public int[] runningSum(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
