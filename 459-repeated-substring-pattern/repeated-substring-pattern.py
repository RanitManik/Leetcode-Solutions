class Solution(object):
    def repeatedSubstringPattern(self, s):
        length = len(s)

        # checks if it is a Repeated Substring
        for i in range(1, length // 2 + 1):
            if length % i == 0:
                substring = s[:i]
                if substring * (length / i) == s:
                    return True

        return False
        