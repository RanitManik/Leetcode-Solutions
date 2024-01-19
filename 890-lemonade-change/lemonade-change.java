class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollarCount = 0;
        int tenDollarCount = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveDollarCount++;
            } else if (bills[i] == 10) {
                if (fiveDollarCount == 0) {
                    return false;
                }
                fiveDollarCount--;
                tenDollarCount++;
            } else if (bills[i] == 20) {
                if (tenDollarCount > 0 && fiveDollarCount > 0) {
                    tenDollarCount--;
                    fiveDollarCount--;
                } else if (fiveDollarCount >= 3) {
                    fiveDollarCount -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
