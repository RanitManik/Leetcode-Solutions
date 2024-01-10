class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            // Assigning elements from 1st half of original array
            result[2 * i] = nums[i];          
            // Assigning elements from 2nd half of original array
            result[2 * i + 1] = nums[i + n];
        }
        
        return result;
    }
}
