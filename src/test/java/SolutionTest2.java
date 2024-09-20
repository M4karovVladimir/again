import static org.junit.Assert.*;
import org.junit.Test;
import second_task.Solution;

public class SolutionTest2 {

    @Test
    public void testBasicCase() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertTrue(result[0] == 0 && result[1] == 1 || result[0] == 1 && result[1] == 0);
    }

    @Test
    public void testAnotherCase() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertTrue(result[0] == 1 && result[1] == 2 || result[0] == 2 && result[1] == 1);
    }

    @Test
    public void testDuplicateNumbers() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertTrue(result[0] == 0 && result[1] == 1 || result[0] == 1 && result[1] == 0);
    }

    @Test
    public void testNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] result = solution.twoSum(nums, target);
        assertTrue(result[0] == 2 && result[1] == 4 || result[0] == 4 && result[1] == 2);
    }

    @Test
    public void testNoSolution() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int target = 7;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    public void testLargeNumbers() {
        Solution solution = new Solution();
        int[] nums = {1000000000, 3, -1000000000, 5};
        int target = 0;
        int[] result = solution.twoSum(nums, target);
        assertTrue(result[0] == 0 && result[1] == 2 || result[0] == 2 && result[1] == 0);
    }
}