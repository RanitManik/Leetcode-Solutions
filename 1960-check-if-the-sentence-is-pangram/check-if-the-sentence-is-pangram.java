class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] letterFrequency = new int[26];

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letterFrequency[c - 'a']++;
            }
        }

        for (int frequency : letterFrequency) {
            if (frequency == 0) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}