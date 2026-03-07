class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1;
        int lmax=height[0], rmax=height[height.length-1];
        int water=0;
        while(l<r){
            if(lmax<rmax){
                l++;
                if(lmax<height[l]) lmax=height[l];
                else water +=lmax-height[l];
            }
            else{
                r--;
                if(rmax<height[r]) rmax=height[r];
                else water+=rmax-height[r];
            }
        }
        return water;
    }
}