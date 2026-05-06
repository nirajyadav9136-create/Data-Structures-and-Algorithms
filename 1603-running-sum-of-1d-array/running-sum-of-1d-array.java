class Solution {
    public int[] runningSum(int[] nums) {
        int len= nums.length;
        int[] ans = new int[len];
        int sum = nums[0];
        for(int i=0;i<len;i++){
            ans[i]=sum; 
        }
       for(int i=0;i<len-1;i++){
            
            ans[i]=sum;
            sum = sum + nums[i+1]; 
         ans [len -1] = sum; 
        }
        return ans;
    }
}