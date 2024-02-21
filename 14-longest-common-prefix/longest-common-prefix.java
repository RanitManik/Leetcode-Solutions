class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the initial common prefix
        String commonPrefix = strs[0];

        // Iterate through the array of strings
        for (int i = 1; i < strs.length; i++) {
            // Update the common prefix by comparing characters
            int j = 0;
            while (j < commonPrefix.length() && j < strs[i].length() && commonPrefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // Trim the common prefix if necessary
            commonPrefix = commonPrefix.substring(0, j);

            // If the common prefix becomes empty, break the loop
            if (commonPrefix.isEmpty()) {
                break;
            }
        }

        return commonPrefix;
    }
}