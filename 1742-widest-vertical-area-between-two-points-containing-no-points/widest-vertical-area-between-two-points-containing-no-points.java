class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xCoordinates = new int[points.length];

        // Extract x-coordinates from the points
        for (int i = 0; i < points.length; i++) {
            xCoordinates[i] = points[i][0];
        }

        // Sort the x-coordinates
        Arrays.sort(xCoordinates);

        int maxWidth = 0;

        // Calculate the maximum width
        for (int i = 1; i < xCoordinates.length; i++) {
            int width = xCoordinates[i] - xCoordinates[i - 1];
            maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;
    }
}