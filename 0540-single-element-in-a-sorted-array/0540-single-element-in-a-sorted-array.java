class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int first=0;
        int second=1;
        if(n==1) return nums[0];
        while(second<n){
            if(nums[first]==nums[second]){
                first+=2;
                second+=2;
            }
            else{
                return nums[first];
            }
        }
        return nums[n-1];
    }
}