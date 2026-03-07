class Solution {
    int gcd(int a, int b){
        return (b==0)?a:gcd(b,a%b);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int n=numsDivide.length;
        int g=numsDivide[0];
        for(int i=0; i<n; i++){
            g=gcd(g,numsDivide[i]);
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(g%nums[i]==0) return i;
        }
        return -1;
    }
}