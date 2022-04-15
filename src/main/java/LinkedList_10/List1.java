/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_10;

/**
 *
 * @author SANATH
 */
public class List1
{
    Node head;
    class Node
    {
        String data;
        Node next;

        public Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public void addFirst(String data)
    {
        Node newnode=new Node(data);
        System.out.println(newnode);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    
    public void addLast(String data)
    {
        Node newnode=new Node(data);
        
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null)
            currnode=currnode.next;
        currnode.next=newnode;
    }
    
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        } 
        head=head.next;
    }      
    
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        } 
        if(head.next==null)  //single node
        {
            head=null;
            return;
        }
        Node seclast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null)
        {
            seclast=lastnode;
            lastnode=lastnode.next;
        }
        seclast.next=null;
    }  
    
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }     
        Node currnode=head;
        while(currnode!=null)
        {
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
    public void check()
    {
        System.out.println(head.data);
        System.out.println(head);
        System.out.println(head.next);
        Node nn=null;
       // System.out.println(nn);
        nn=head;
        System.out.println(nn);
        System.out.println(nn.next);
    }
    public static void main(String[] args)
    {
        List1 ll=new List1();
        ll.addFirst("is");
        ll.addFirst("this");
        ll.printList();
        ll.addLast("linked");
        ll.addLast("list");
        ll.printList();
        ll.check();
//        System.out.println(ll);
//     
//        List1 lll=null;
//        System.out.println(lll);
//        lll=ll;
//        
//        System.out.println(lll);
        
//        ll.deleteFirst();
//        ll.deleteLast();
//        ll.printList();
        
    }
}
