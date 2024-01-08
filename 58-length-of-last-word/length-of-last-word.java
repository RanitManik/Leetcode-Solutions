public class Solution {
    public int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing whitespaces
        String trimmedString = s.trim();
        
        // Initialize a counter for the length of the last word
        int wordLength = 0;

        // Iterate through the characters of the trimmed string from right to left
        for (int i = trimmedString.length() - 1; i >= 0; i--) {
            // Check if the current character is not a space
            if (trimmedString.charAt(i) != ' ') {
                // Increment the word length counter
                wordLength++;
            } else {
                // Break the loop if a space is encountered, indicating the end of the last word
                break;
            }
        }
        
        // Return the length of the last word
        return wordLength;
    }
}
