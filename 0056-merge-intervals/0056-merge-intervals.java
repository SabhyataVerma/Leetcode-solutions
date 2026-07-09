class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged=new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        for(int interval[]:intervals){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1]<interval[0]){
                merged.add(interval);
            }
            else{
                merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}