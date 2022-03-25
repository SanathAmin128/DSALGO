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
public class subsequence_5   //or subset
{
    public static void main(String[] args)
    
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        subsequence(0,arr,al);
    }
    public static void subsequence(int ind,ArrayList<Integer> arr,ArrayList<Integer> al)
    {
        if(ind>=arr.size())
        {
            System.out.println(al);
            return;
        }
        al.add(arr.get(ind));
        subsequence(ind+1,arr,al);
        al.remove(arr.get(ind));
        subsequence(ind+1,arr,al);
        
    }
}
