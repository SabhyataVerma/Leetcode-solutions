class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int cnt1=0;
        int cnt2=0;
        for(int i=0; i<n; i++){
            if(nums[i]>=10){
                cnt2+=nums[i];
            }
            else if(nums[i]<10){
                cnt1+=nums[i];
            }
        }
        if(cnt1==cnt2){
            return false;
        }
        return true;
    }
}