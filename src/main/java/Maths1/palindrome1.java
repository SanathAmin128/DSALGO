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
public class palindrome1
{
     public boolean isPalindrome(int x) 
    {
        int temp=x;
        int digit,num=0;
        if(x<0)
            return false;
        else
        {
            while(x>0)
            { 
                num=num*10+(x%10);
                x=x/10;
            }
            if(temp==num)
                return true;
            else
                return false;
        }
    }
}
