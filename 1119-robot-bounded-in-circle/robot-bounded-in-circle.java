class Solution {
    public boolean isRobotBounded(String instructions) {
        int dirX = 0;
        int dirY = 1;

        int x = 0;
        int y = 0;

        for (char i : instructions.toCharArray()) {
            if (i == 'G') {
                x += dirX;
                y += dirY;
            } else if (i == 'L') {
                int temp = dirX;
                dirX = -dirY;
                dirY = temp;
            } else if (i == 'R') {
                int temp = dirX;
                dirX = dirY;
                dirY = -temp;
            }
        }

        // If the robot is back at the starting point or facing a direction other than
        // north,
        // then it is guaranteed to be in a circle after the instructions.
        return (x == 0 && y == 0) || (dirX != 0 || dirY != 1);
    }
}
