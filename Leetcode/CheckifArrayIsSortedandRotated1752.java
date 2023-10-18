class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        if(n==1){
            return true;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1) % n]){
                count++;
            }
        }
        return count>1? false:true;
    }
}
---------------------------------------------------------------------------------------------------------------------
// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
