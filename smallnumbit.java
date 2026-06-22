// 3370. Smallest Number With All Set Bits
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given a positive number n.

// Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits

 

// Example 1:

// Input: n = 5

// Output: 7

// Explanation:

// The binary representation of 7 is "111".

// Example 2:

// Input: n = 10

// Output: 15

// Explanation:

// The binary representation of 15 is "1111".

// Example 3:

// Input: n = 3

// Output: 3

// Explanation:

// The binary representation of 3 is "11".

 

// Constraints:

// 1 <= n <= 1000

public class smallnumbit{
    class Solution {
    public int smallestNumber(int n) {
        int a=1;
        while(n>a){
            a=(a<<1)|1;
        }
        return a;
    }
}
}