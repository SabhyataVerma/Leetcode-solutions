class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r){
        if((nums[l]*-1)<nums[r]){
            r--;
        }
        else if((nums[l]*-1)>nums[r]){
            l++;
        }
        else{
            return nums[r];
        }
        }
        return -1;
    }
}