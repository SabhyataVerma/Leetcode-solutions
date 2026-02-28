class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int flag=0;
        for(int i=0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                flag++;
            }
        }
        if(nums[n-1]>nums[0]){
            flag++;
        }
        if(flag<2){
            return true;
        }
        return false;
    }
}