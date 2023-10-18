//---------------------------Brute Froce-----------------------------------------
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;

                }
            }
        }
        return arr;
    }
}
//---------------------------Optimal Solution--------------------------------------
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1=0,num2=0;
        int n=nums.length;
        int[] arr=new int[2];
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            num1=nums[i];
            num2=target-num1;
            if(hm.containsKey(num2)){
                arr[0]=i;
                arr[1]=hm.get(num2);
                return arr;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return arr;
    }
}
