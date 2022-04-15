/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_8;

import java.util.ArrayList;

/**
 *
 * @author SANATH
 */
public class subsequence_sum_count_5_3
{
    public static void main(String[] args)
    
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int s=0;
        System.out.println(subsequence(0,arr,s,3));
    }
    public static int subsequence(int ind,ArrayList<Integer> arr,int s,int sum)
    {
        if(ind>=arr.size())
        {
            if(s==sum)
            {
                return 1;
            }
            return 0;
        }
        s+=arr.get(ind);
        int l=subsequence(ind+1,arr,s,sum);
        s-=arr.get(ind);
        int r=subsequence(ind+1,arr,s,sum);
        return l+r; 
    }
}
