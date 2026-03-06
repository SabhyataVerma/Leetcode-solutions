class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(candidates,target,0,res,new ArrayList<>(),0);
        return res;
    }
    private void backtrack(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> comb, int sum){
        if(sum==target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(sum>target) return;
        for(int i=start; i<candidates.length; i++){
            comb.add(candidates[i]);
            backtrack(candidates,target,i,res,comb,sum+candidates[i]);
            comb.remove(comb.size()-1);
        }
    }
}