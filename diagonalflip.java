/*Given a square binary matrix of drimensions N×N.
Flip the matrix diagonally and return the matrix.


Problem Constraints
1 <= N <= 1000
A[i][j] ={0, 1}


Input Format
Given a 2D integer array.


Output Format
Return a 2D integer array.


Example Input
Input 1:
A = 4
B = [[1, 0],
     [0, 1]]
Input 2:

A = [[1, 0],
     [1, 0]]


Example Output
Output 1:
[[1, 0],
 [0, 1]]
Output 2:

[[1, 1],
 [0, 0]]*/
code:
public class Solution {
    public int[][] solve(int[][] A) {
        int i,j;
       int b[][]=new int[A[0].length][A[0].length];
       for(i=0;i<A[0].length;i++){
           for(j=0;j<A[0].length;j++)
           {
               b[i][j]=A[j][i];
           }
       }


        return b;
    }
}
 