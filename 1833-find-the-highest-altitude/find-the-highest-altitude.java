class Solution {
    public int largestAltitude(int[] gain) {
        int [] alt = new int[gain.length + 1];
        
        for(int i = 0 ; i<gain.length;i++ ){
            alt[0] = 0;
            alt[i+1]=alt[i]+gain[i];
        }
        int max = alt [0];
        for(int i = 0 ; i<alt.length; i++){
            
            if(alt[i]>max){
                max = alt[i];
            }
        }
        return max;
    }
}