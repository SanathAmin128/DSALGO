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
public class subset_sum_7
{
    
    static void subsets(int ind,int sum,ArrayList<Integer> arr,int n,ArrayList<Integer> sumset)
    {
        if(ind==n)
        {
            sumset.add(sum);
            return;
        }
        subsets(ind+1,sum+arr.get(ind),arr,n,sumset);
        subsets(ind+1,sum,arr,n,sumset);
    }
    
    public static ArrayList<Integer> subsetSum(ArrayList<Integer> arr,int n)
    {
        ArrayList<Integer> sumsubset=new ArrayList<Integer>();
        subsets(0,0,arr,n,sumsubset);
        Collections.sort(sumsubset);
        return sumsubset;
    }
    
    public static void main(String[] args)
    
    {
        ArrayList<Integer> ss=new ArrayList<Integer>();
        ss.add(1);
        ss.add(2);
        ss.add(3);
        ArrayList<Integer> q=subsetSum(ss,3);
        System.out.println(q);
    }
}
