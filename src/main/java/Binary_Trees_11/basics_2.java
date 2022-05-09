/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Trees_11;

/**
 *
 * @author SANATH
 */
public class basics_2
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
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+ Math.max(lh,rh);
    }
    
    public static void main(String[] args)
    
    {
        
    }
}
