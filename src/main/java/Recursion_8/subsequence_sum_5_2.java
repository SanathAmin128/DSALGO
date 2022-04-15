/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_8;

import java.util.ArrayList;
//to retrun only one sum
/**
 *
 * @author SANATH
 */
public class subsequence_sum_5_2
{
    public static void main(String[] args)
    
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int s=0;
        subsequence(0,arr,al,s,3);
    }
    public static boolean subsequence(int ind,ArrayList<Integer> arr,ArrayList<Integer> al,int s,int sum)
    {
        if(ind>=arr.size())
        {
            if(s==sum)
            {
                System.out.println(al);
                return true;
            }
            return false;
        }
        al.add(arr.get(ind));
        s+=arr.get(ind);
        if(subsequence(ind+1,arr,al,s,sum)==true)
            return true;
        al.remove(arr.get(ind));
        s-=arr.get(ind);
        if(subsequence(ind+1,arr,al,s,sum)==true)
            return true;
        return false; 
    }
}
