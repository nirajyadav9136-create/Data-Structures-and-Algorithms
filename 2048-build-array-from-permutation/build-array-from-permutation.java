class Solution {
    public int[] buildArray(int[] nums) { 
        int[] ans =new int[nums.length];
        int index = nums.length - 1;
        for (int  i=0 ;i<=index ; i++ ){
            ans[i]=nums[nums[i]];
        }   
        return ans;
    }
}