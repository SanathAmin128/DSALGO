/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_6;

/**
 *
 * @author SANATH
 */
public class evaluate_reverse_polish_1
{
    public int evalRPN(String[] tokens) {
        Stack<Integer> sta=new Stack<>();
        int res;
        for(int i=0;i<tokens.length;i++)
        { 
            String s="+-*/";
            if(!s.contains(tokens[i]))
                sta.push(Integer.valueOf(tokens[i]));
            else
            {
                int num2=sta.pop();
                int num1=sta.pop();
                res=calculate(num1,num2,tokens[i]);
                sta.push(res);
            }
        }
        return sta.pop();
    }
    public int calculate(int num1,int num2,String opp)
    {
        int res=0;
        switch(opp)
        {
           
            case "+":res=num1+num2;
                     break;
            case "-":res=num1-num2;
                     break;
            case "*":res=num1*num2;
                     break;
            case "/":res=num1/num2;
                     break;
        }
        return res;
}
