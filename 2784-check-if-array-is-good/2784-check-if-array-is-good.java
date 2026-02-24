class Solution {
    public boolean isGood(int[] nums) {
        int len=nums.length;
        int max=0;
        for(int i=0; i<len; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(len!=max+1){
            return false;
        }
        int[] count=new int[max+1];
        for(int i=0; i<max+1; i++){
            count[nums[i]]++;
        }
        for(int i=1; i<max; i++){
            if(count[i]!=1){
                return false;
            }
        }
        if(count[max]==2){
            return true;
        }
        else{
            return false;
        }
    }
}