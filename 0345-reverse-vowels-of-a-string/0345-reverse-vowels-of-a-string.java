class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while (l<r && arr[l]!='a'&& arr[l]!='e'&& arr[l]!='i'&& arr[l]!='o'&& arr[l]!='u' && arr[l]!='A'&& arr[l]!='E'&& arr[l]!='I'&& arr[l]!='O'&& arr[l]!='U') l++;
            while (l<r && arr[r]!='a'&& arr[r]!='e'&& arr[r]!='i'&& arr[r]!='o'&& arr[r]!='u' && arr[r]!='A'&& arr[r]!='E'&& arr[r]!='I'&& arr[r]!='O'&& arr[r]!='U') r--;
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}