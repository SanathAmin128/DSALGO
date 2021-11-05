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
public class shuffle1
{
     public int[] shuffle(int[] nums, int n)
    {
        int ans[]=new int[nums.length];
        int i=0,j=n;
        for(int k=0;k<ans.length;k++)
        {
            if(k%2==0)
                ans[k]=nums[i++];
            else
                ans[k]=nums[j++];
        }
        return ans;
    }
}
