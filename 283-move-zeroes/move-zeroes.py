class Solution(object):
    def moveZeroes(self, nums):
        non_zero_index = 0

        for i in range(len(nums)):
            if nums[i] != 0:
                nums[i], nums[non_zero_index] = nums[non_zero_index], nums[i]
                non_zero_index += 1