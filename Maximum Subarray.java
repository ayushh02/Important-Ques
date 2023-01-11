/*Q. Maximum Subarray (Kadane's Algorithm)
   Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.


Code:*/
class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int max=Integer.MIN_VALUE;

        for(int i:nums){
            cur+=i;
            if(cur>max){
                max=cur;
            }
            if (cur<0){
                cur=0;
            }
        }
        return max;
    }
}
