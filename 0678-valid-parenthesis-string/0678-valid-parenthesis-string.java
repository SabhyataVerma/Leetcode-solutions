class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int mini=0;
        int maxi=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                mini++;
                maxi++;
            }
            else if(s.charAt(i)==')'){
                mini--;
                maxi--;
            }
            else{
                mini--;
                maxi++;
            }
            if(maxi<0) return false;
            if(mini<0) mini=0;
        }
        if(mini==0) return true;
        return false;
    }
}