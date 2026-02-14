class Solution {
    public int hammingWeight(int n) {
       String binaryString = Integer.toBinaryString(n);
       char[] charArray = binaryString.toCharArray(); 
       int count=0;
       for(int i=0; i<charArray.length; i++){
        if(charArray[i]=='1'){
            count++;
        }
       }
       return count;
    }
}