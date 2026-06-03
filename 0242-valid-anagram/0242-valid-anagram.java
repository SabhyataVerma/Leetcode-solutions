class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> countS=new HashMap<>();
        HashMap<Character,Integer> countT=new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int count;
            if(countS.containsKey(ch)){
                count=countS.get(ch)+1;
            }
            else{
                count=0;
            }
            countS.put(ch,count);
        }
        for (int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            int count;
            if(countT.containsKey(ch)){
                count=countT.get(ch)+1;
            }
            else{
                count=0;
            }
            countT.put(ch,count);
        }
        return countS.equals(countT);
    }
}