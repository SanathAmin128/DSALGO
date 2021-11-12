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
public class kadaneAlgo_2
{//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

//A subarray is a contiguous part of an array.
    //max subarray sum
     public int maxSubArray(int[] nums)
     {
        int sum = 0;
        int maxi = nums[0]; 
        for(int i = 0;i<nums.length;i++) 
        {
            sum += nums[i];
            if(sum > maxi) maxi = sum;
            if(sum < 0) sum = 0;
        }
        return maxi; 
    }
    
}
