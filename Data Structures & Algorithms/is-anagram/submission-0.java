class Solution {
    public boolean isAnagram(String s, String t) {
        //a = ;
        //b = ;
        if(s.length()-1 != t.length()-1){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (char num:s.toCharArray()){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(char num:t.toCharArray()){
            map.put(num,map.getOrDefault(num,0)-1);
            
        }
        for(int count : map.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
        



    }
}
