class Solution(object):
    def findTheDifference(self, s, t):
        sum_s, sum_t = 0, 0

        for char in s:
            sum_s += ord(char)
        for char in t:
            sum_t += ord(char)
        
        return (chr(sum_t - sum_s))
