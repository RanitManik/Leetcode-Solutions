class Solution {
    public int subtractProductAndSum(int n) {
        // Convert the integer to a string
        String digits = Integer.toString(n);

        // Initialize variables for product and sum
        int productOfDigits = 1;
        int sumOfDigits = 0;

        // Iterate through each digit in the string
        for (int i = 0; i < digits.length(); i++) {
            // Extract the current digit
            int iDigit = Character.getNumericValue(digits.charAt(i));

            // Calculate product and sum
            productOfDigits *= iDigit;
            sumOfDigits += iDigit;
        }

        // Calculate the result (difference between product and sum)
        int result = productOfDigits - sumOfDigits;

        // Return the final result
        return result;
    }
}