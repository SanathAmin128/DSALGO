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
public class sort_arrray_of_0_1_2s_3
{
     public void sortColors(int[] nums) {
        int lo = 0; 
        int hi = nums.length - 1; 
        int mid = 0; 
        int temp; 
        while (mid <= hi) { 
            switch (nums[mid]) { 
                case 0: { 
                    temp = nums[lo]; 
                    nums[lo] = nums[mid]; 
                    nums[mid] = temp; 
                    lo++; 
                    mid++; 
                    break; 
                } 
                case 1: 
                    mid++; 
                    break; 
                case 2: { 
                    temp = nums[mid]; 
                    nums[mid] = nums[hi]; 
                    nums[hi] = temp; 
                    hi--; 
                    break; 
                } 
            } 
        }
    }
}
