/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_8;
import java.util.*;
/**
 *
 * @author SANATH
 */
public class sort_stack_2
{
    public static void main(String[] args)
    
    {
        Stack<Integer> s=new Stack<Integer>();
        s.push(4);
        s.push(7);
        s.push(6);
        s.push(2);
        s.push(5);
        System.out.println(s);
        sort(s);
        System.out.println(s);
    }
    public static void sort(Stack<Integer> s)
    {
        if(s.size()==1)
            return;
        int temp=s.pop();
        sort(s);
        insertt(s,temp);
    }
    public static void insertt(Stack<Integer> s,int temp)
    {
        if((s.size()==0 || (s.peek()<=temp)))
        {
            s.push(temp);
            return;
        }
        int val=s.pop();
        insertt(s,temp);
        s.push(val);
        return;
    }
}
