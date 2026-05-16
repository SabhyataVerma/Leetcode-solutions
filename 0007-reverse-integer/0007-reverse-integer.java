class Solution {
    public int reverse(int x) {
        int n = 0;

        while (x != 0) {
            int r = x % 10;
            
            // Check for positive overflow
            if (n > Integer.MAX_VALUE / 10 || (n == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0;
            }
            // Check for negative overflow
            if (n < Integer.MIN_VALUE / 10 || (n == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0;
            }
            
            n = n * 10 + r;
            x /= 10;
        }
        
        return n;
    }
}
