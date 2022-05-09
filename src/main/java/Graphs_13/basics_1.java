/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs_13;

import java.util.ArrayList;

/**
 *
 * @author SANATH
 */
public class basics_1
{
    public static void main(String[] args)
    {
        //Adjacency Matrix
        //if there are n nodes then adjacency matrix will be n+1,m+1
        int n=4,m=4;
        int adj[][]=new int[n+1][m+1];    //   1    3--4
                                            //  \  /
        adj[1][2]=1;                          // 2
        adj[2][1]=1;
                           //                  0 1 2 3 4
        adj[2][3]=1;       //               0  
        adj[3][2]=1;       //               1      1
                           //               2    1   1
        adj[3][4]=1;      //                3      1   1
        adj[4][3]=1;       //               4        1
        
        //Adjacency List
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
            list.add(new ArrayList<Integer>());
        
        list.get(1).add(2);   //edge btw 1 and 2
        list.get(2).add(2);   //edge btw 2 and 1
        
        list.get(2).add(3);   //edge btw 2 and 3
        list.get(3).add(2);   //edge btw 3 and 2
        
        for(int i=1;i<n;i++)
            for(int j=0;j<list.get(i).size();j++)
                System.out.println(list.get(i).get(j)+" ");
        
        
    }
}
