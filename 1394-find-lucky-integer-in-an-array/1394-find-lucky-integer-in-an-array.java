class Solution {
    public int findLucky(int[] arr) {
        int max=0;
        int len=arr.length;  
        for(int i=0; i<len; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

      
        int[] count=new int[max+1];
        for(int i=0; i<len; i++){
            count[arr[i]]++;
        }

        for (int i=max; i>=1; i--){
            if(i==count[i]){
                return i;
            }
        }
        return -1;
    }
}