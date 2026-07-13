class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int cnt=0;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int x=sum-k;
            if(mp.containsKey(x)){
                cnt+=mp.get(x);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}