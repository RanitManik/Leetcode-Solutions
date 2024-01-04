class Solution {
    public int arraySign(int[] nums) {

        int countMinus = 0;
        
        for (int i : nums) {
            if (i == 0) {
                return 0;
            }
            else if (i < 0) {
                countMinus ++;
            }
        }
        if (countMinus == 0) {
            return 1;
        } else if (countMinus % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
