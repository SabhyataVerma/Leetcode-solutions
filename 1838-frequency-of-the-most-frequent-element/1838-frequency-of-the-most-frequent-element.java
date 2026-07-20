class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxFreq=0;
        int left=0;
        long sum=0;
        for(int right=0; right<n; right++){
            long target=nums[right];
            sum+=target;
            while(((right-left+1)*target)-sum>k){
                sum-=nums[left];
                left++;
            }
            maxFreq=Math.max(maxFreq,right-left+1);
        }
        return maxFreq;
    }
}