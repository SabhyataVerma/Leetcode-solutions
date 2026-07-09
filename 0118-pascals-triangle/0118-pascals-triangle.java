class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row=new ArrayList<>();
            int ans=1;
            for(int j=0; j<i; j++){
                row.add(ans);
                ans*=(i-j);
                ans/=j+1;
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}