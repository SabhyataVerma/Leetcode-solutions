class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0) return res;
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,res,map,new StringBuilder());
        return res;
    }
    private void backtrack(String digits, int idx, List<String> res, String[] map, StringBuilder comb){
        if(idx==digits.length()){
            res.add(comb.toString());
            return;
        }
        String letters=map[digits.charAt(idx)-'0'];
        for(char l: letters.toCharArray()){
            comb.append(l);
            backtrack(digits,idx+1,res,map,comb);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}