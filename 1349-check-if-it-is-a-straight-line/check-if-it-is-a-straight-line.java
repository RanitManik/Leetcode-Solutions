class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 3) {
            return true; // Any two points always form a straight line
        }

        // Check if the line is vertical (avoid division by zero)
        if (coordinates[1][0] - coordinates[0][0] == 0) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    return false; // Not a straight line (not vertical)
                }
            }
            return true; // All points have the same x-coordinate, forming a straight line (vertical)
        }

        // Calculate the slope of the line formed by the first two points
        double slope = (double) (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);

        // Check if all other points have the same slope
        for (int i = 2; i < coordinates.length; i++) {
            // Check if the line is vertical
            if (coordinates[i][0] - coordinates[0][0] == 0) {
                return false; // Not a straight line (not vertical)
            }

            double currentSlope = (double) (coordinates[i][1] - coordinates[0][1]) / (coordinates[i][0] - coordinates[0][0]);
            if (currentSlope != slope) {
                return false; // Points do not form a straight line
            }
        }

        return true; // All points have the same slope, forming a straight line
    }
}
