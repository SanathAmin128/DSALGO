/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_6;
import java.util.*;
/**
 *
 * @author SANATH
 */
public class online_stock_span_2
{
     Stack<int[]> s;
    public online_stock_span_2() {
        s=new Stack<>();
    }
    
    public int next(int price) {
        int ans=1;
        while(!s.empty() && s.peek()[0]<=price)
              ans+=(s.pop()[1]);
        s.push(new int[]{price, ans});
        return ans;
    }
}
   
