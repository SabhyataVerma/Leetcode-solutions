class Solution {
    public boolean judgeCircle(String moves) {
        char[] charArray = moves.toCharArray();
        int updown=0;
        int leftright=0;
        int n=charArray.length;
        for(int i=0; i<n;i++){
            if(charArray[i]=='U') updown++;
            else if(charArray[i]=='D') updown--;
            else if(charArray[i]=='L') leftright++;
            else leftright--;
        }
        if(updown==0 && leftright==0){
            return true;
        }
        return false;
    }
}