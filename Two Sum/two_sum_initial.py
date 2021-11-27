import unittest

def twoNumberSum(nums, targetSum):
    solution = []
    for i in range(len(nums)):
        for y in range(i + 1, len(nums)):
            if nums[i] + nums[y] == targetSum:
                return [nums[i], nums[y]]
    return solution


class TestProgram(unittest.TestCase):
    def test_case_1(self):
        output = twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)
        self.assertTrue(len(output) == 2)
        self.assertTrue(11 in output)
        self.assertTrue(-1 in output)
