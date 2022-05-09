/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search_Trees_12;

/**
 *
 * @author SANATH
 */
class Node {
 
    int data;
    Node left, right;
 
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
 
public class basics_1 {
    
    Node root;
    
     static boolean binary(Node node,int x)
    {
        if(node==null )
            return false;
        if(node.data==x)
            return true;
        if(node.data>x)
            return binary(node.left,x);
        else
            return binary(node.right,x);
    }
   
   static int Ceil(Node node, int input)
    {
        if (node == null) 
            return -1; 
        if (node.data == input) 
            return node.data;
        if (node.data < input) 
            return Ceil(node.right, input);

        int ceil = Ceil(node.left, input);
 
        return (ceil >= input) ? ceil : node.data;
    }
 
    static int Floor(Node node, int input)
    {
        if (node == null) 
            return Integer.MAX_VALUE;; 
        if (node.data == input) 
            return node.data;
        if (node.data > input) 
            return Floor(node.left, input);

        int ceil = Floor(node.right, input);
 
        return (ceil <= input) ?  ceil:node.data;
    }
   
     public static Node insertIntoBST(Node root, int val) {
        if(root==null)
            return new Node(val);
        if(root.data>val)
            root.left=insertIntoBST(root.left,val);
        else
            root.right=insertIntoBST(root.right,val);
        return root;
    }
    // Driver Code
    public static void main(String[] args)
    {
        basics_1 tree = new basics_1();
        tree.root = new Node(8);
        tree.root.left = new Node(4);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(14);
       
        System.out.print("Searching:");
        System.out.println(binary(tree.root,4));
        
        System.out.print("Ceil of a tree:");
        int x=Ceil(tree.root,13);
        System.out.println(x);
        
        System.out.print("Floor of a tree:");
        int y=Floor(tree.root,7);
        System.out.println(y);
        
        
    }
}
