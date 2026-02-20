class Solution {
    public int[] twoSum(int[] nums, int target) {
       int len=nums.length;
       int[] out= new int[2];
       for(int i=0; i<len; i++){
        for(int j=i+1; j<len; j++){
            if(nums[i]+nums[j]==target){
                out[0]=j;
                out[1]=i;
                break;
            }
        }
       }
       return out;
    }
}