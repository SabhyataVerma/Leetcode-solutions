class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        int digitSum=0;
        for(int i=0; i<n; i++){
            int temp=nums[i];
            while(nums[i]>=1){
                int a=nums[i]%10;
                nums[i]/=10;
                digitSum+=a;
            }
        }
        return Math.abs(sum-digitSum);
    }
}