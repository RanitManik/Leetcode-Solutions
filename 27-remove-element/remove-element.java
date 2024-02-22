class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Variable to track the count of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Move the element to the front of the array
                nums[k] = nums[i];
                k++; // Increment the count of elements not equal to val
            }
        }

        return k; // Return the count of elements not equal to val
    }
}