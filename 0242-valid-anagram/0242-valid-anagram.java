class Solution {
    public boolean isAnagram(String s, String t) {

        // Convert strings to character arrays
        char[] array_s = s.toCharArray();
        char[] array_t = t.toCharArray();

        // Sort the arrays
        Arrays.sort(array_s);
        Arrays.sort(array_t);

        // Check if the sorted arrays have the same content
        return Arrays.equals(array_s, array_t);
    }
}