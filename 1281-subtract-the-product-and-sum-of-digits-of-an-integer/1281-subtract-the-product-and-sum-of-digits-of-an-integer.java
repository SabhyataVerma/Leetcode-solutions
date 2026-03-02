class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int temp=n;
        while(n>0){
            int a=n%10;
            n/=10;
            sum+=a;
            product*=a;
        }
        return (product-sum);
    }
}