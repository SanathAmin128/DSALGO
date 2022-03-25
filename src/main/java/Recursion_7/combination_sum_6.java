/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_7;
import java.util.*;
/**
 *
 * @author SANATH
 */
public class combination_sum_6
{
  
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        subsets(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public static void subsets(int ind,int nums[],int target,ArrayList<Integer> arr,List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i=ind;i<nums.length;i++)
        {
            if(i!=ind && nums[i]==nums[i-1])
                continue;
            if(nums[i]>target)
                break;
            arr.add(nums[i]);
            subsets(i+1,nums,target-nums[i],arr,ans);
            arr.remove(arr.size()-1);
        }
        
    }
    
    public static void main(String[] args)
    
    {
        int arr[]=new int[]{1,2,2,5,1,1};
        List<List<Integer>> ans=combinationSum2(arr,5);
        System.out.println(ans);
    }
}

        
    


