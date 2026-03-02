class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int row=accounts.length;
        int col=accounts[0].length;
        int sum=0;
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
            sum=0;
        }
        return max;
    }
}