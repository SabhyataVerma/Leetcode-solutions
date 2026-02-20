class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==2 || nums.length==1){
            return -1;
        }
        else{
            Arrays.sort(nums);
            return nums[1]; 
        } 
    }
}