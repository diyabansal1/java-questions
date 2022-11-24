/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2 */

class Solution {
    public int searchInsert(int[] nums, int target) {

        int j;
        int l = nums.length;
        for (j = 0; j <= l - 1; j++) {
            if (nums[j] >= target) {
                return j;
            }
        }
        return l;
    }
}