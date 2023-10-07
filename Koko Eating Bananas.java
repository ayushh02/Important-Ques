/* Koko Eating Bananas
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
 

Constraints:

CODE:*/
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high=1000000000;

        while(low<high){
            int mid=low + (high - low) / 2;
            if(canEat(piles,h,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean canEat(int[] piles, int h,int k) {
        int time=0;
        for(int pile:piles){
            int c=pile/k;
            time+=c;
            if(pile%k!=0){
                time++;
            }
        }
        return time<=h;
    }
}
