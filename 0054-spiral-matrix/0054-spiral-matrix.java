class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int t = 0, b = matrix.length - 1;
        int l = 0, r = matrix[0].length - 1;

        List<Integer> spiral = new ArrayList<>();

        while(t <= b && l <= r){

            for(int i = l; i <= r; i++)
                spiral.add(matrix[t][i]);
            t++;

            for(int j = t; j <= b; j++)
                spiral.add(matrix[j][r]);
            r--;

            if(t <= b){
                for(int k = r; k >= l; k--)
                    spiral.add(matrix[b][k]);
                b--;
            }

            if(l <= r){
                for(int m = b; m >= t; m--)
                    spiral.add(matrix[m][l]);
                l++;
            }
        }

        return spiral;
    }
}