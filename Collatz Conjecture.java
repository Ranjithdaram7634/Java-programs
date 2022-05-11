/*Given two integers A and B, where A is the first element of the sequence then find Bth element of the sequence.
If the kth element of the sequence is X then k+1th element calculated as:
if X is even then next element is X/2.
else next element is 3×X + 1.


Problem Constraints
1 <= A <= 109
1 <= B <= 105


Input Format
Given two integers A and B.


Output Format
Return an integer.


Example Input
Input 1:
A = 1
B = 3
Input 2:

A = 5
B = 6

Output 1:
2
Output 2:

1*/
code:
long long solve(int A, int B) {
    long i;
    long ans=(int)A;
    for(i=2;i<=B;i++)
    {
    if(ans%2==0)
    {
        ans=ans/2;
    }
    else
    {
        ans=3*ans+1;
    }
    }
    return ans;
}