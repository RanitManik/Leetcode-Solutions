# Algorithm

1. If the number of points is less than 3, return true because any two points always form a straight line.

2. Check if the line is vertical by comparing the x-coordinates of the first two points. If they are equal, it's a vertical line.

3. If the line is not vertical, calculate the slope of the line formed by the first two points: `slope = (y2 - y1) / (x2 - x1)`.

4. Iterate through the remaining points and calculate the slope between each point and the first point.

5. If any calculated slope is not equal to the initial slope, return false because the points do not lie on a straight line.

6. If all slopes are equal, return true because the points form a straight line.

# Pseudo-Code
Here's a pseudo-code representation of the algorithm:

```plaintext
function checkStraightLine(coordinates):
    if length of coordinates < 3:
        return true  // Any two points always form a straight line

    // Check if the line is vertical
    if coordinates[1][0] - coordinates[0][0] == 0:
        for i from 2 to length of coordinates - 1:
            if coordinates[i][0] != coordinates[0][0]:
                return false  // Not a straight line (not vertical)
        return true  // All points have the same x-coordinate, forming a straight line (vertical)

    // Calculate the slope of the line formed by the first two points
    slope = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0])

    // Check if all other points have the same slope
    for i from 2 to length of coordinates - 1:
        // Check if the line is vertical
        if coordinates[i][0] - coordinates[0][0] == 0:
            return false  // Not a straight line (not vertical)

        currentSlope = (coordinates[i][1] - coordinates[0][1]) / (coordinates[i][0] - coordinates[0][0])
        if currentSlope != slope:
            return false  // Points do not form a straight line

    return true  // All points have the same slope, forming a straight line
```
