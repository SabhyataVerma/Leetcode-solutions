class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        
        int n = rows * columns;
        int missing = 0;
        int repeated = 0;
        
        int[] freq = new int[n + 1];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                freq[grid[i][j]]++;
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(freq[i] == 0){
                missing = i;
            }
            else if(freq[i] == 2){
                repeated = i;
            }
        }
        
        return new int[]{repeated, missing};
    }
}
