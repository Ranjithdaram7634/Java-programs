You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
code:
class Solution {
    public void rotate(int[][] matrix) {
        int i,j,k;
       int ans[][]=new int[matrix.length][matrix[0].length];
        for(i=0;i<matrix.length;i++)
        {
            k=0;
            for(j=matrix[0].length-1;j>=0;j--)
            {
                ans[i][k++]=matrix[j][i];
            }
           
           
        }
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix.length;j++)
            {
                matrix[i][j]=ans[i][j];
            }
         }
     }
   
    
}