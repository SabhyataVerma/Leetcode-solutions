class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length/3;
        int cnt1=0; int cnt2=0;
        int match1=Integer.MIN_VALUE; int match2=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==match1){
                cnt1++;
            }
            else if(nums[i]==match2){
                cnt2++;
            }
            else if(cnt1==0 && nums[i]!=match2){
                match1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0 && nums[i]!=match1){
                cnt2=1;
                match2=nums[i];
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int c1=0; int c2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==match1){
                c1++;
            }
            else if(nums[i]==match2){
                c2++;
            }
        }
        int mini=nums.length/3+1;
        if(c1>=mini){
            res.add(match1);
        }
        if(c2>=mini && match1!=match2){
            res.add(match2);
        }
        return res;
    }
}