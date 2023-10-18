class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=nums[i];
        }
        return (N*(N+1))/2-sum;
    }
}
//Finding the total sum of array and sub with the fatorial of length of the array

