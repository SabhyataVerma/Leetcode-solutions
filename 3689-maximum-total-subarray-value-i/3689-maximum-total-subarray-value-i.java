class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long maxi=Integer.MIN_VALUE;
        long mini=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            maxi=Math.max(maxi,nums[i]);
            mini=Math.min(mini,nums[i]);
        }
        return k*(maxi-mini);
    }
}