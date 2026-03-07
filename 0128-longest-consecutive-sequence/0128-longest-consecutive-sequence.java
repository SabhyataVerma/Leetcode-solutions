class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxi=1;
        int cnt=1;
        if(n==0) return 0;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]) continue;
            if(nums[i+1]-nums[i]==1){
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