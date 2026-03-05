import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        int x = Math.min(n, m);
        int[] ans = new int[x];

        int k = 0;

        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                ans[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }

        return Arrays.copyOfRange(ans, 0, k);
    }
}