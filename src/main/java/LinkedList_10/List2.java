/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_10;
import java.util.*;
/**
 *
 * @author SANATH
 */
public class List2
{
    public static void main(String[] args)
    
    {
        LinkedList<String> ll=new LinkedList<>();
        ll.addFirst("a");
        ll.addFirst("is");
        System.out.println(ll);
        
        ll.addLast("Linked");
        ll.addLast("List");
        ll.add("List");  //by default will be added at last
        System.out.println(ll);
        System.out.println(ll.size());
        
        for(int i=0;i<ll.size();i++)
            System.out.print(ll.get(i)+"->");
        System.out.println("null");
        
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
        ll.remove(1);
        System.out.println(ll);
    }
}
