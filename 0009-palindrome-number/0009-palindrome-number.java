class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original=x;
        int reversed=0;
        
        while(x!=0){
            int d=x%10;
            reversed=reversed*10+d;
            x/=10;
            
        }

        if(original==reversed){
            return true;
        }else{return false;}
    }
}