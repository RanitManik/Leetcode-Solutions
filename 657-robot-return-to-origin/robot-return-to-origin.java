class Solution {
    public boolean judgeCircle(String moves) {
       int x = 0; // Horizontal movement
       int y = 0; // Vertical movement

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        return x == 0 && y == 0; 
    }
}