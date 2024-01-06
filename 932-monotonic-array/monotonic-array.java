class Solution {
    public boolean isMonotonic(int[] nums) {
        return isMonotoneIncreasing(nums) || isMonotoneDecreasing(nums);
    }

    public boolean isMonotoneIncreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;

            if (nums[i] > nums[j]) {
                return false;
            }
        }
        return true;
    }

    public boolean isMonotoneDecreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;

            if (nums[i] < nums[j]) {
                return false;
            }
        }
        return true;
    }
}
