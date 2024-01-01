class Solution(object):
    def isAnagram(self, s, t):
        
        # Convert strings to lists of characters
        list_s = list(s)
        list_t = list(t)

        # Sort the lists
        list_s.sort()
        list_t.sort()

        # Check if the sorted lists have the same content
        return list_s == list_t
        