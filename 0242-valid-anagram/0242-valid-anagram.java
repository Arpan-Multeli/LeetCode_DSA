class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> count = new HashMap<>();

        for(char ch : s.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()){
            if(!count.containsKey(ch) || count.get(ch) == 0){
                return false;
            }   
            count.put(ch,count.get(ch) -1);
        }return true;
    }
}