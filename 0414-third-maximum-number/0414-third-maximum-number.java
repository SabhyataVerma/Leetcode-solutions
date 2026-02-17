import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int j = 0;

        arr[j++] = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                arr[j++] = nums[i];
            }
        }

        if(j < 3){
            return arr[j - 1];
        }

        return arr[j - 3];
    }
}
