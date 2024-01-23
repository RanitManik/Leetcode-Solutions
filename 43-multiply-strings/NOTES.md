
# Algorithm:

1. **Input Validation:**
   - Check if either `num1` or `num2` is "0". If yes, return "0" (multiplication by 0 results in 0).

2. **Initialization:**
   - Initialize an array called `result` to store the intermediate product and final result.

3. **Multiplication:**
   - Iterate through the characters of `num1` in reverse order.
     - For each digit in `num1`, iterate through the characters of `num2` in reverse order.
       - Multiply the current digits of `num1` and `num2`, add the current result value, and update the result array.
       - Update the carry for the next iteration.

4. **Convert and Remove Leading Zeros:**
   - Convert the result array to a string, removing any leading zeros.

5. **Output:**
   - Return the final result.

# Pseudocode:

```plaintext
function multiplyStrings(num1, num2):
    if num1 equals "0" OR num2 equals "0":
        return "0"
    
    len1 = length of num1
    len2 = length of num2
    result = array of size len1 + len2

    // Initialize result array with zeros
    for i from 0 to len1 + len2 - 1:
        result[i] = 0

    // Multiply the digits
    for i from len1 - 1 to 0:
        carry = 0
        for j from len2 - 1 to 0:
            tempSum = (num1[i] - '0') * (num2[j] - '0') + result[i + j + 1] + carry
            result[i + j + 1] = tempSum % 10
            carry = tempSum / 10

        result[i] += carry

    // Convert result array to string
    resultString = ""
    for digit in result:
        resultString += digit

    // Remove leading zeros
    while resultString is not empty AND resultString[0] equals '0':
        remove first character from resultString

    // Return the final result
    return resultString if resultString is not empty else "0"

// Example usage:
num1 = "123"
num2 = "456"
result = multiplyStrings(num1, num2)
print(result)
```

