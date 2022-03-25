/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_7;

import java.util.ArrayList;

/**
 *
 * @author SANATH
 */
public class sort_array_1
{
    public static void main(String[] args)
    
    {
         ArrayList<Integer> l=new ArrayList<>();
         //l.add(9);
         l.add(4);
         l.add(7);
         l.add(6);
         l.add(2);
         l.add(5);
         System.out.println(l);
         sort(l);
         System.out.println(l);
    }
    public static void sort(ArrayList<Integer> arr)
    {
        if(arr.size()==1)
            return;
        int temp=arr.get(arr.size()-1);
        arr.remove(arr.get(arr.size()-1));
        sort(arr);
        insertt(arr,temp);
    }
    public static void insertt(ArrayList<Integer> arr,int temp)
    {
        if(arr.isEmpty() || (arr.get(arr.size()-1) <=temp))
        {
            arr.add(temp);
            return;
        } 
        int val=arr.get(arr.size()-1);
        arr.remove(arr.get(arr.size()-1));
        insertt(arr,temp);
        arr.add(val);
       // return;  
    }
}
