class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] ans={-1,-1};
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(nums[i]==target){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}