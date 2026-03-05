class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int cnt=0;
        while(i<n && j<m){
            if(g[i]<=s[j]){
                i++;
                j++;
                cnt++;
            }
            else{
                j++;
            }
        }
        return cnt;
    }
}