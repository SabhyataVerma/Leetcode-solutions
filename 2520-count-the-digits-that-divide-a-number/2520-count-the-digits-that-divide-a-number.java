class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int temp=num;
        while(num>=1){
            int a=num%10;
            num/=10;
            if(temp%a==0){
                cnt++;
            }
        }
        return cnt;
    }
}