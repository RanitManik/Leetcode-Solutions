class Solution(object):
    def canMakeArithmeticProgression(self, arr):
        # sort the array
        arr.sort()
        
        # calculate the common difference
        commonDifference = arr[1] - arr[0]

        # Step 3: Check if all differences are the same
        for i in range(1, len(arr)):
            if arr[i] - arr[i - 1] != commonDifference:
                return False
        return True