class Solution(object):
    def mergeAlternately(self, word1, word2):
        merged = ''

        lenWord1 = len(word1)
        lenWord2 = len(word2)

        for i in range(max(lenWord1, lenWord2)):
            if (i < lenWord1):
                merged += word1[i]
            if (i < lenWord2):
                merged += word2[i]
        
        return merged
        