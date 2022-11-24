/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left */

class Solution {
    public boolean isPalindrome(int x) {
        int t = x;
        int srt = 0;
        while (x > 0) {
            int rem = x % 10;
            srt = srt * 10 + rem;
            x = x / 10;
        }
        return srt == t ? true : false;
    }
}