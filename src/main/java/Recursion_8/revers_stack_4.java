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
public class revers_stack_4
{
    public static void main(String[] args)
    
    {
        Stack<Integer> sta=new Stack<>();
        sta.push(5);
        sta.push(4);
        sta.push(3);
        sta.push(2);
        sta.push(1);
        System.out.println(sta);
        sortsta(sta);
        System.out.println(sta);
    }
    static void sortsta(Stack<Integer> sta)
    {
        if(sta.size()==1)
            return;
        int temp=sta.pop();
        sortsta(sta);
        insert(sta,temp);
    }
    static void insert(Stack<Integer> sta,int temp)
    {
        if(sta.size()==1)
        {
            int val=sta.pop();
            sta.push(temp);
            sta.push(val);
            return;
        }
        int val2=sta.pop();
        insert(sta,temp);
        sta.push(val2);
       // return;
    }
    
}
