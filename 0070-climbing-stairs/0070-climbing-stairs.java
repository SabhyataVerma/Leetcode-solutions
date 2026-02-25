class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int a = 1; // ways to climb 1 step
        int b = 2; // ways to climb 2 steps
        int result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        
        return result;
    }
}
