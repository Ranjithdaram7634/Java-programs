A Pythagorean triplet is a set of three integers a, b and c such that a2 + b2 = c2.
Find the number of pythagorean triplets such that all the elements of the triplet are less than or equal to A.


Problem Constraints
1 <= A <= 103


Input Format
Given an integer A.


Output Format
Return an integer.


Example Input
Input 1:
A = 5
Input 2:

A = 13


Example Output
Output 1:
1
Output 2:

3

code:
public class Solution {
    public int solve(int a) {
        int i,j,k,count=0;
        for(k=a;k>0;k--)
        {
            for(j=2;j<k;j++){
                i=1;
                while(i<j){
                if((i*i)+(j*j)==(k*k)){
                    count++;
                    break;
                }
                else
                {
                    i++;
                }
                }

            }
            
        }
        return count;
    }
}