/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix_3;

/**
 *
 * @author SANATH
 */
public class odd_val_in_a_matrix_1
{
    public int oddCells(int m, int n, int[][] indices) 
    {
        int ans[][]=new int[m][n];
        for(int i=0;i<indices.length;i++)
        {
            for(int j=0;j<n;j++)
                ans[indices[i][0]][j]+=1;
            
            for(int j=0;j<m;j++)
                ans[j][indices[i][1]]+=1;
            
        } 
        int count=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(ans[i][j]%2!=0)
                    count++;
        return count; 
    }
}
