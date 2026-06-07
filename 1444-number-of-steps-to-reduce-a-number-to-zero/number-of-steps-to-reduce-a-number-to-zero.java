class Solution {
    public int numberOfSteps(int num) {
        return reduce(num , 0);
    }
    int reduce(int num , int step){
        if(num == 0){
            return step;
        }
        if(num%2 ==0){
            return reduce(num/2 ,step +1);
        }
        return reduce(num-1,step+1);
    }
}