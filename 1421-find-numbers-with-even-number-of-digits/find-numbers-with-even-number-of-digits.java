class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i<nums.length ;i++){
            int num= nums[i];
            int dig = 0;
            while(num>0){
                num=num/10;
                dig++;

            }
            if(dig%2 == 0){
                sum++;
            }
        }
        return sum ;
    }
}