/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths1;

/**
 *
 * @author SANATH
 */
public class fibonacci_2
{
    public int fib(int n) 
    {
        if(n<=1)
           return n;
        return fib(n-1) + fib(n-2);
    }
}
