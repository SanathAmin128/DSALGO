/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Trees_11;
import java.util.*;
/**
 *
 * @author SANATH
 */
public class basics_1
{
    static class Node
    {
        int data;
        Node right=null;
        Node left=null;
        
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    static class BinaryTree
    {
        static int index=-1;
        public static Node buildtree(int nodes[])
        {
            index++;
            if(nodes[index]==-1)
                return null;
            Node node=new Node(nodes[index]);
            node.left=buildtree(nodes);
            node.right=buildtree(nodes);
            return node;
        }
    }
   
    public static void preorder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+"\t");
        preorder(root.left);
        preorder(root.right);
    }
   
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+"\t");
        inorder(root.right);
    }
    
    public static void postorder(Node root)
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"\t");
    }
    
    public static List<List<Integer>> levelorder(Node root)
    {
        Queue<Node> queue=new LinkedList<Node>();
        List<List<Integer>> finall=new ArrayList<List<Integer>>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            int len=queue.size();
            for(int i=0;i<len;i++)
            {
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                list.add(queue.poll().data);
            }
            finall.add(list);
        }
        return finall;
    }
    
    public static List<Integer> iterativePreOrder(Node root)
    {
        List<Integer> list=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            Node temp=stack.pop();
            if(temp.right!=null)
                stack.push(temp.right);
            if(temp.left!=null)
                stack.push(temp.left);
            list.add(temp.data);
        }
        return list;
    }
    
    public static List<Integer> iterativeInOrder(Node root)
    {
        List<Integer> list=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        Node node=root;
        while(true)
        {
            if(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                node=stack.pop();
                list.add(node.data);
                node=node.right;
            }
        }
        return list;
    }
    
    public static List<Integer> iterativePostOrder(Node root)
    {
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.push(root);
            if(root.left!=null)
                st1.push(root.left);
            if(root.right!=null)
                st1.push(root.right);
        }
        while(!st2.isEmpty()){
            list.add(st2.pop().data);
        }
        return list;
    }
    
    public static void main(String[] args)
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};           //         1 
        BinaryTree bt=new BinaryTree();                          //      2       3
        Node root=bt.buildtree(nodes);                           //    4   5       6
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
       
        System.out.print("Preorder:");
        preorder(root);
        System.out.println();
        
        System.out.print("Inorder:");
        inorder(root);
        System.out.println();
        
        System.out.print("Postorder:");
        postorder(root);
        System.out.println();
        
        System.out.print("Levelorder:");
        List<List<Integer>> list=levelorder(root);
        System.out.print(list);
        System.out.println();
        
        System.out.print("IterativePreorder:");
        List<Integer> list1=iterativePreOrder(root);
        System.out.print(list1);
        System.out.println();
        
        System.out.print("IterativeInorder:");
        List<Integer> list2=iterativeInOrder(root);
        System.out.print(list2);
        System.out.println();
        
        System.out.print("IterativePostorder:");
        List<Integer> list3=iterativePostOrder(root);
        System.out.print(list3);
        System.out.println();
    }
}
