class Solution {
    public int countOdds(int low, int high) {
        // If low is odd or high is even, we have odd numbers in the range
        if (low % 2 != 0 || high % 2 != 0) {
            return (high - low) / 2 + 1;
        }
        // If both low and high are even, we have even numbers in the range
        else {
            return (high - low) / 2;
        }
    }
}
