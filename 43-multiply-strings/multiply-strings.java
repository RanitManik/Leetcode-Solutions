public class Solution {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            int carry = 0;
            for (int j = len2 - 1; j >= 0; j--) {
                int tempSum = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + result[i + j + 1] + carry;
                result[i + j + 1] = tempSum % 10;
                carry = tempSum / 10;
            }

            result[i] += carry;
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            sb.append(digit);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
