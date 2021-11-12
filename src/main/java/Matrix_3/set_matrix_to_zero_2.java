/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix_3;
import java.util.*;
/**
 *
 * @author SANATH
 */
public class set_matrix_to_zero_2
{
    //Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
    public void setZeroes(int[][] matrix) 
    {
        
        List<int[]> indices = new ArrayList<>();
        
        for(int i=0; i < matrix.length; i++)
        {
            for(int j=0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                    indices.add(new int[]{i, j});
            }
        }
        
        for(int[] index : indices){
            for(int i=0; i < matrix[0].length; i++)
                matrix[index[0]][i] = 0;
            for(int i=0; i < matrix.length; i++)
                matrix[i][index[1]] = 0;
        }
    
    
    }
}
