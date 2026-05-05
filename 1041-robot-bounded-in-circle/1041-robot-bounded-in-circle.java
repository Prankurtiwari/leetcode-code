class Solution {
    public boolean isRobotBounded(String ins) {
        int x =0;
        int y =0;
        int dx =0;
        int dy =1;

        for(char ch : ins.toCharArray()) {
            if(ch == 'G') {
                x+=dx;
                y+=dy;
            } else if (ch =='L') {
                int temp = dx;
                dx = dy;
                dy = temp;
                dx = (-1) * dx; // Left means 2nd quadrant 
            } else if (ch == 'R') {
                int temp = dx;
                dx = dy;
                dy = temp;
                dy = (-1) * dy; // opposite of left 
            }
        }

        return (x == 0 && y ==0) || (dx != 0 || dy != 1);
    }
}