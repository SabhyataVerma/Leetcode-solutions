class Solution {
    public int reverseBits(int n) {

        String binary = String.format("%32s", Integer.toBinaryString(n))
                             .replace(' ', '0');

        char[] arr = binary.toCharArray();
        char[] arr1 = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }

        String ans = new String(arr1);

        int number = (int) Long.parseLong(ans, 2);

        return number;
    }
}
