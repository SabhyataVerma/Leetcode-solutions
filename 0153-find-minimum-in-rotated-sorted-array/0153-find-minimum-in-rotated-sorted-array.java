class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(nums[0]>nums[n-1]){
            for(int i=0; i<n-1; i++){
                if(nums[i]>nums[i+1]){
                    return nums[i+1];
                }
            }
        }
        else{
            return nums[0];
        }
        return -1;
    }
}