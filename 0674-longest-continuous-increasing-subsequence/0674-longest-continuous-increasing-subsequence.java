class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int cnt=1;
        int maxi=1;
        if(n==1) return 1;
        for(int i=0; i<n-1; i++){
            if(nums[i]<nums[i+1]){
                cnt++;
            }
            else{
                cnt=1;
            }
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
}