class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            list.add(index[j],nums[j]);
        }
          for(int i =0;i<list.size();i++){
            target[i]=list.get(i);
        }
       return target;
    }
}