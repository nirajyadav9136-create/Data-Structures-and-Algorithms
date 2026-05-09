class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0;i<items.size();i++){
                String a = "";
                if(ruleKey.equals("type")){
                    a=items.get(i).get(0);
                }
                if(ruleKey.equals("color")){
                    a=items.get(i).get(1);
                }
                if(ruleKey.equals("name")){
                    a=items.get(i).get(2);
                }
                if(ruleValue.equals(a)){
                    count++;
                }
        }
        return count;
    }
}