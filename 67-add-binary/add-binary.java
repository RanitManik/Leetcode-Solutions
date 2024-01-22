class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Start from the rightmost bit
        int i = a.length() - 1, j = b.length() - 1;

        // Perform binary addition
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            // Append the current bit to the result
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }
}