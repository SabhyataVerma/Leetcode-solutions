import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int k = 0;

        for(int i = 1; i <= n; i++){

            while(k < n && nums[k] < i){
                k++;
            }

            if(k < n && nums[k] == i){
                k++;
            }
            else{
                list.add(i);
            }
        }

        return list;
    }
}